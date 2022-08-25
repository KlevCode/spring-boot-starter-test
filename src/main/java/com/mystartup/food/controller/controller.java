package com.mystartup.food.controller;

import com.mystartup.food.model.Food;
import com.mystartup.food.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

  private FoodService foodService;

  public controller(FoodService foodService) {
    this.foodService = foodService;
  }

  @GetMapping("/home")
  public String getHome(Model model) {
    model.addAttribute("message", "Hello there, this is a message from the controller");

    Food[] foods = foodService.getFoods();

    model.addAttribute("foods", foods);
    return "home";
  }
}
