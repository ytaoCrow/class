package com.example.shop.controller;

import com.example.shop.dao.Order;
import com.example.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id, Model model){
        Order order = this.orderService.getOrderById(id);
        model.addAttribute("order", order);

        return "order";
    }
}
