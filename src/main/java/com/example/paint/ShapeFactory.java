package com.example.paint;

public interface ShapeFactory {

    ShapeBase getShape(String key, ShapeDto dto);

}