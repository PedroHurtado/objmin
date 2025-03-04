package com.example.paint;

public class Point {
    public int x;
    public int y;
    public Point(int x,int y){
        this.x =x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int value){
        x=value;
    }
    public int getY(){
        return y;
    }
    public void setY(int value){
        y=value;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
}
