package com.example.paint;

import java.util.HashMap;

public class ColorFactoryImpl implements ColorFactory {
    private final HashMap<String, Color> colors = new HashMap<>();
    public void register(String key, Color color){
        colors.put(key, color);
    }
    @Override
    public Color getColor(String key){
        return colors.get(key);
    }
}
