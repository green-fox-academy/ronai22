package com.greenfoxacademy.macrotisexam.controllers;

import com.greenfoxacademy.macrotisexam.services.AttractionService;
import com.greenfoxacademy.macrotisexam.services.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttractionController {

  AttractionService attractionService;

  @Autowired
  public AttractionController(AttractionServiceImpl attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    model.addAttribute( "list", attractionService.findAllAttractions());
    return "index";
  }

}
