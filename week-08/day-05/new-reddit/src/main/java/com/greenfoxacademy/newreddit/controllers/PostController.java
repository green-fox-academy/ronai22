package com.greenfoxacademy.newreddit.controllers;
import com.greenfoxacademy.newreddit.models.Post;
import com.greenfoxacademy.newreddit.services.PostService;
import com.greenfoxacademy.newreddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  PostService service;

  @Autowired
  public PostController(PostServiceImpl service) {
    this.service = service;
  }

  @GetMapping("")
  public String indexPage(Model model) {
    model.addAttribute("postList", service.findAllByScoreOrder());
    return "index";
  }

  @GetMapping("/add")
  public String addPageRender(Model model) {
    model.addAttribute("newPost", new Post());
    return "add";
  }

  @PostMapping("/add")
  public String addPost(@ModelAttribute Post post) {
    service.save(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/score/{type}")
  public String scorePost(@PathVariable(value = "id") long id, @PathVariable(value = "type") String type) {
    service.scorePost(id, type);
    return "redirect:/";
  }
}
