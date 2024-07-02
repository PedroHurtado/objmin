package com.example.paint;

import java.util.HashMap;
import java.util.function.Function;
public class ShapeFactoryImpl implements ShapeFactory {
    private final HashMap<String,Function<ShapeDto, ShapeBase>> shapes = new HashMap<>();
    public void register(String key,Function<ShapeDto,ShapeBase> shape){
        shapes.put(key, shape);
    }
    @Override
    public ShapeBase getShape(String key, ShapeDto dto){
        var ctor = shapes.get(key);
        return ctor.apply(dto);
    }
}
