package com.mystartup.food.service;

import com.mystartup.food.model.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

  public Food[] getFoods() {

    Food[] foods = {new Food("Pizza", 8.00), new Food("Doner", 4.00), new Food("Cola", 1.50)};

    return foods;
  }
}
