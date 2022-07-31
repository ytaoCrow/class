package com.example.shop.dao;

import java.util.List;

public class Total {
    private  int total;
    private Order order1;
    private Order order2;

    public Order getOrder1() {
        return order1;
    }

    public void setOrder1(Order order1) {
        this.order1 = order1;
    }

    public Order getOrder2() {
        return order2;
    }

    public void setOrder2(Order order2) {
        this.order2 = order2;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


}
