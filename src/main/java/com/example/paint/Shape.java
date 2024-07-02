package com.example.paint;

import java.util.function.Consumer;

public interface Shape {  
    void draw(Consumer<String> printer);
    void setColor(Color value);     
    void setPointStart(Point value);
    void setPointEnd(Point value);
    Boolean getCanDraw();
} 
