package com.greenfoxacademy.hellodi.Controller;
import com.greenfoxacademy.hellodi.Service.StudentService;
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

  @Autowired
  StudentService studentService;

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

  @GetMapping("/gfa")
  public String greenFoxAcademyMain(Model model) {
    model.addAttribute("counter", studentService.count());
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String greenFoxAcademyStudentList(Model model) {
    model.addAttribute("list", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String addGreenFoxAcademyStudent() {
    return "add";
  }

  @GetMapping("/gfa/save")
  public String saveToGreenFoxAcademyStudentList(@RequestParam ("name") String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/gfa/check")
  public String studentCheckPage() {
    return "check";
  }

  @GetMapping("/gfa/checking")
  public String checkStudent(@RequestParam ("name") String name, Model model) {
    model.addAttribute("isThere", studentService.check(name));
    model.addAttribute("name", name);
    return "checked";
  }

}
