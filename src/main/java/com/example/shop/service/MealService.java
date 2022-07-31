package com.example.shop.service;

import com.example.shop.dao.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MealService {
    List<Meal> mealList;

    public MealService(){
        this.mealList = new ArrayList<>();
        this.mealList.add(new Meal("hambugger", 100, "This is delicious"));
    }

    public Meal getMealByName(String name) {
        for (int i = 0; i < this.mealList.size(); i++) {
            if (this.mealList.get(i).getName().equals(name.toLowerCase())) {
                return this.mealList.get(i);
            }
        }
        return null;
    }
}
