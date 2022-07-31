package com.example.shop.controller;

import com.example.shop.dao.Meal;
import com.example.shop.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping()
public class MealController {
    @Autowired
    MealService mealService;

    @GetMapping("/meal")
    public String getMealByName(@RequestParam String name, Model model){
        Meal meal = this.mealService.getMealByName(name);
        model.addAttribute("meal", meal);

        return "meal";
    }
}
