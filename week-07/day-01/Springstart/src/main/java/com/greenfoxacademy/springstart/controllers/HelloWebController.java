package com.greenfoxacademy.springstart.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;


@Controller
public class HelloWebController {
  Random random = new Random();
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  String[] colors = { "Tomato", "Orange", "DodgerBlue", "MediumSeaGreen", "Gray", "SlateBlue", "Violet", "LightGray"};

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", hellos[random.nextInt(hellos.length - 1)]);
    model.addAttribute("color", colors[random.nextInt(colors.length - 1)]);
    model.addAttribute("fontSize", 12 + random.nextInt(40));
    return "greeting";
  }
}
