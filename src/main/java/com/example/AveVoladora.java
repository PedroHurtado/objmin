package com.example;

public abstract class AveVoladora extends Ave{
    private Integer velocidad;
    public AveVoladora(Integer peso,Integer velociad){
        super(peso);
        this.velocidad = velociad;
    }
    public Integer getVelocidad(){
        return velocidad;
    }

}
