package com.example.shop.controller;

import com.example.shop.dao.Total;
import com.example.shop.service.OrderManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/admin")

public class OrderManageController {


    @Autowired
    OrderManageService orderManageService;

    @GetMapping("/")
    public String getUserById(Model model){

        Total total = this.orderManageService.getTotalOrders();
        //System.out.println(total.getTotal() + "," + total.getOrder1().getTotalPrice());    //debug
        model.addAttribute("orderManage", total);

        return "total";
    }
}



