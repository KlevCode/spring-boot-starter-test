package com.mystartup.food.controller;

import com.mystartup.food.model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

  @GetMapping("/home")
  public String getHome(Model model) {
    model.addAttribute("message", "Hello there, this is a message from the controller");

    Food[] foods = {new Food("Pizza", 8.00), new Food("Doner", 4.00), new Food("Cola", 1.50)};

    model.addAttribute("foods", foods);
    return "home";
  }
}
