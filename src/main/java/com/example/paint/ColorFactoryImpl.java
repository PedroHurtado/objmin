package com.example.paint;

import java.util.HashMap;
import java.util.Map;

public class ColorFactoryImpl implements ColorFactory {
    private final Map<String, Color> colors = new HashMap<>();
    public void register(String key, Color color){
        colors.put(key, color);
        
        
    }
    @Override
    public Color getColor(String key){
        var color = colors.get(key);
        if(color == null){
            throw new RuntimeException();
        }
        return color;
    }
}
