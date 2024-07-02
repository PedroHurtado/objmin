package com.example.paint;

import java.util.function.Consumer;

public abstract class ShapeBase implements Shape{
    private Point pointStart;
    private Point pointEnd;
    private Color color;
    private Boolean canDraw;
    public ShapeBase(Point poinStart, Point pointEnd, Color color){
        this.pointStart = poinStart;
        this.pointEnd = pointEnd;
        this.color = color;
        canDraw = true;
    }
    @Override
    public void draw(Consumer<String> printer) {
        printer.accept(toString());
        canDraw =false;        
    }
    @Override
    public void setColor(Color value) {
        if(!value.equals(color)){
            color=value;
            canDraw =true;
        }
    }
    @Override
    public void setPointStart(Point value) {
        if(!value.equals(pointStart)){
            pointStart = value;
            canDraw =true;
        }
    }
    @Override
    public void setPointEnd(Point value) {
        if(!value.equals(pointEnd)){
            pointEnd = value;
            canDraw =true;
        }
    }
    @Override
    public String toString() {
        return "ShapeBase [pointStart=" + pointStart + ", pointEnd=" + pointEnd + ", color=" + color + "]";
    }
    @Override
    public Boolean getCanDraw(){
        return canDraw;
    }
}
