package com.mystartup.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

  @GetMapping("/home")
  public String getHome(Model model) {
    model.addAttribute("message", "Hello there, this is a message from the controller");
    return "home";
  }
}
