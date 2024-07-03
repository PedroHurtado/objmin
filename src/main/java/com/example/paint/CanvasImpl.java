package com.example.paint;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CanvasImpl implements Canvas {
    private List<Shape> shapes = new ArrayList<>();
    private final Consumer<String> printer;
    public CanvasImpl(Consumer<String> printer){
        this.printer =printer;        
    }

    private void print(){
        for (var shape : shapes) {
            if(shape.getCanDraw()){
                shape.draw(printer);
            }            
        }
    }

    @Override
    public void remove(Shape shape) {
        shapes.remove(shape);
        print();
    }

    @Override
    public void add(Shape shape) {
        shapes.add(shape);
        print();
    }
}
