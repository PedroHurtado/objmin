package com.example.vertical.domain.pizza;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.example.vertical.core.BaseEntity;

public class Pizza extends BaseEntity {

    public static final Double PFOFIF = 1.2D;
    
    private String name;
    private String description;
    private String url;
    private Set<Ingredient> ingredients = new HashSet<>();  

    protected Pizza(UUID id, String name, String description, String url) {
        super(id);        
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public List<Ingredient> getIngredients(){
        return ingredients.stream().toList();
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getUrl() {
        return url;
    }
    public double getPrice(){
        var price =0D;
        for (Ingredient ingredient : ingredients) {
            price+=ingredient.getPrice();
        }
        return price * Pizza.PFOFIF;
    }
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    public void removeIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);
    }
    public void update(String name, String description, String url){
        this.name = name;
        this.description = description;
        this.url = url;
    }    
    public static Pizza create(UUID id, String name, String description, String url){
        return new Pizza(id, name, description, url);
    }
}
