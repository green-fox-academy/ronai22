package com.greenfoxacademy.newreddit.controllers;

import com.greenfoxacademy.newreddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  PostService service;

  @Autowired
  public PostController(PostService service) {
    this.service = service;
  }

  @GetMapping("")
  public String indexPage() {
    return "index";
  }

}
