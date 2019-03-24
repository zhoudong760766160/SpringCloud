package com.zhoudong.dto;

import java.io.Serializable;

/**
 * @author zhoudong
 * @create 2019/3/3
 * product dto
 */
public class ProductDto implements Serializable {

    private int id;
    private String name;
    private double price;
    private int store;

    public ProductDto(int id, String name, double price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public ProductDto() {
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

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", store=" + store +
                '}';
    }
}
