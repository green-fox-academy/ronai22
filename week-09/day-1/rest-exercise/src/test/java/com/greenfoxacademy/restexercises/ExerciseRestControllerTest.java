package com.greenfoxacademy.restexercises;

import com.greenfoxacademy.restexercises.controllers.ExerciseRestController;
import com.greenfoxacademy.restexercises.models.Result;
import com.greenfoxacademy.restexercises.models.ResultArray;
import com.greenfoxacademy.restexercises.repositories.MainRepository;
import com.greenfoxacademy.restexercises.services.ExService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ExerciseRestController.class)
public class ExerciseRestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  ExService service;

  @Mock
  MainRepository repository;

  @Test
  public void should_returnDoubleNumber_whenGettingRegularInput() throws Exception {
    mockMvc.perform(get("/doubling?input=15"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is(15)))
            .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void should_returnGreeting_whenGettingNameAndTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=Attila&title=student"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Attila, my dear student!")));
  }

  @Test
  public void should_returnFactorOfTheNumbersRecursive_whenGettingNameAndTitle() throws Exception {
    when(service.untilChecker(any(), any())).thenReturn(2004310016);
    mockMvc.perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"15\"}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.result", is(2004310016)));
  }

  @Test
  public void should_returnSumOfTheNumbersRecursive_whenGettingNameAndTitle() throws Exception {
    when(service.untilChecker(any(), any())).thenReturn(120);
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"15\"}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void should_returnStringWithAddedA_whenGettingNormalInput() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void should_returnSummaryOfTheArrayElements_whenGettingNormalInput() throws Exception {
    Result result = new Result(18) ;
    when(service.getArrayCalculation(any())).thenReturn(result);

    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\",\"numbers\": [1, 2, 5, 10]}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.result", is(18)));
  }

  @Test
  public void should_returnMultiplicationOfTheArrayElements_whenGettingNormalInput() throws Exception {
    Result result = new Result(120) ;
    when(service.getArrayCalculation(any())).thenReturn(result);

    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\",\"numbers\": [1, 2, 5, 10]}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void should_returnDoubleOfTheArrayElements_whenGettingNormalInput() throws Exception {
    ResultArray resultArray = new ResultArray();
    int[] testArray = new int[]{2, 4, 10, 20};
    resultArray.setResult(testArray);
    when(service.getArrayCalculation(any())).thenReturn(resultArray);

    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\",\"numbers\": [1, 2, 5, 10]}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.result").isArray())
            .andExpect(jsonPath("$.result", Matchers.containsInAnyOrder(4, 2, 10, 20)))
            .andExpect(jsonPath("$.result.length()").value(testArray.length));
  }
}