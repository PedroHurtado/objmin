package com.example.vertical.domain.pizza;

import java.util.UUID;

import com.example.vertical.core.BaseEntity;

public class Ingredient extends BaseEntity {
    private String name;
    private Double price;
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    protected Ingredient(UUID id,String name, Double price){
        super(id);
        this.name = name;
        this.price = price;
    }
    public void update(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public static Ingredient Create(UUID id,String name, Double price){
        return new Ingredient(id, name, price);
    }
}
