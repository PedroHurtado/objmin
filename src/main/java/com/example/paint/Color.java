package com.example.paint;

public class Color {
    private final int red;
    private final int green;
    private final int blue;
    public Color(int red,int green,int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public int getRed(){
        return red;
    }
    public int getGreen(){
        return green;
    }
    public int getBlue(){
        return blue;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + red;
        result = prime * result + green;
        result = prime * result + blue;
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
        Color other = (Color) obj;
        if (red != other.red)
            return false;
        if (green != other.green)
            return false;
        if (blue != other.blue)
            return false;
        return true;
    }
}
