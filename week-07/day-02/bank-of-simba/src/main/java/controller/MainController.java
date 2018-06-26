package controller;
import model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  private List<BankAccount> accounts;

  public MainController() {
    accounts = new ArrayList<>();
  }

  @GetMapping("/show")
  public String showIndexPage(Model model) {
    return "show";
  }
}
