package com.greenfoxacademy.newreddit.controllers;
import com.greenfoxacademy.newreddit.models.Post;
import com.greenfoxacademy.newreddit.services.PostService;
import com.greenfoxacademy.newreddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
public class PageController {

  PostService service;

  @Autowired
  public PageController(PostServiceImpl service) {
    this.service = service;
  }

  @RequestMapping(value="/posts",method=RequestMethod.GET)
  public Page<Post> list(Pageable pageable){
    Page<Post> posts = service.listAllByPage(pageable);
    return posts;
  }
}
