package com.greenfoxacademy.simbank.controller;
import com.greenfoxacademy.simbank.model.BankAccount;
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
    accounts.add(new BankAccount("Simba", 10000, "lion"));
    accounts.add(new BankAccount("Timon", 1000, "meerkat"));
    accounts.add(new BankAccount("Pumbaa", 10, "warthog"));
    accounts.add(new BankAccount("Rafiki", 5000, "mandrill"));
    accounts.add(new BankAccount("Scar", 500, "lion"));
  }

  @GetMapping ("")
  public String showIndexPage(Model model) {
    model.addAttribute("name", "name");
    return "index";
  }

  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion"));
    return "show";
  }

  @GetMapping ("/example")
  public String showExample(Model model) {
    model.addAttribute("string1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "example";
  }

  @GetMapping ("/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "accounts";
  }
}