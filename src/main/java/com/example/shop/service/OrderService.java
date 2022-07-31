package com.example.shop.service;

import com.example.shop.dao.Meal;
import com.example.shop.dao.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderService {

    List<Order> orderList;
    List<Meal> mealList;


    public OrderService() {

        this.orderList = new ArrayList<>();
        Order order1 = new Order(1, 100, "Bill");
        Meal meal = new Meal("hambugger", 100, "This is delicious");

        this.mealList = new ArrayList<>();
        this.mealList.add(meal);
        order1.setMeals(this.mealList);
        this.orderList.add(order1);
    }

    public Order getOrderById(int seq) {
        for (int i = 0; i < this.orderList.size(); i++) {
            if (this.orderList.get(i).getSeq() == seq){
                return this.orderList.get(i);
            }
        }
        return null;
    }
}
