package com.example.shop.service;

import com.example.shop.dao.Meal;
import com.example.shop.dao.Order;
import com.example.shop.dao.Total;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderManageService {

    Total total = new Total();

    public OrderManageService() {

        Order order1 = new Order(1, 1000, "Bill");
        Order order2 = new Order(2, 2000, "Justin");

        Integer total = order1.getTotalPrice() + order2.getTotalPrice();

        this.total.setOrder1(order1);
        this.total.setOrder2(order2);
        this.total.setTotal(total);

    }

    public Total getTotalOrders() {
        return this.total;
    }
}
