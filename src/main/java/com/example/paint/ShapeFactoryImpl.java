package com.example.paint;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
public class ShapeFactoryImpl implements ShapeFactory {
    private final Map<String,Function<ShapeDto, ShapeBase>> shapes = new HashMap<>();
    public void register(String key,Function<ShapeDto,ShapeBase> shape){
        shapes.put(key, shape);
    }
    @Override
    public ShapeBase getShape(String key, ShapeDto dto){
        var shape = shapes.get(key);
        if(shape==null){
            throw new RuntimeException();
        }
        return shape.apply(dto);
    }
}
