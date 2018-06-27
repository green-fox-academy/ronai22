package com.greenfoxacademy.hellodi.Controller;
import com.greenfoxacademy.hellodi.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String showUsefulPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredBackgroundPage(Model model) {
    model.addAttribute("utilityservice", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String showEmailValidationPage(@RequestParam ("email") String email, Model model) {
    model.addAttribute("validator", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping("/useful/encode")
  public String encodingPage(@RequestParam ("text") String text, @RequestParam ("number") int number, Model model) {
    model.addAttribute("codedtext", utilityService.caesar(text, number));
    return "coding";
  }

  @GetMapping("/useful/decode")
  public String decodingPage(@RequestParam ("text") String text, @RequestParam ("number") int number, Model model) {
    model.addAttribute("codedtext", utilityService.caesar(text, -number));
    return "coding";
  }




}
