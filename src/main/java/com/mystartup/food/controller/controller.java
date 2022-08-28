package com.mystartup.food.controller;

import com.mystartup.food.model.Food;
import com.mystartup.food.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

  private FoodService foodService;

  public controller(FoodService foodService) {
    this.foodService = foodService;
  }

  @PostMapping("/home")
  public String addFood(Model model, Food food) {
    if (foodService.addFood(food) < 1) {
      model.addAttribute("errorMessage", String.format("Could not add %s", food.getName()));
    }
    model.addAttribute("successMessage", String.format("Successfully added %s", food.getName()));

    Food[] foods = foodService.getFoods();

    model.addAttribute("foods", foods);

    return "home";
  }

  @GetMapping("/home")
  public String getHome(Model model, Food food) {
    model.addAttribute("message", "Hello there, this is a message from the controller");

    Food[] foods = foodService.getFoods();

    model.addAttribute("foods", foods);
    return "home";
  }
}
