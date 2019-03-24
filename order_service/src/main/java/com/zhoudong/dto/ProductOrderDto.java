package com.zhoudong.dto;

import java.io.Serializable;

/**
 * @author zhoudong
 * @create 2019/3/7
 */
public class ProductOrderDto implements Serializable {

    private int id;
    private int orderId;
    private String name;
    private double price;
    private String username;

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
