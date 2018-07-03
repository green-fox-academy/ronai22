package com.greenfoxacademy.listingtodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  @RequestMapping(value="", method=RequestMethod.GET)
  public String list2(Model model) {
    return "redirect:/todo/list";
  }

  @RequestMapping(value="/list", method=RequestMethod.GET)
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
