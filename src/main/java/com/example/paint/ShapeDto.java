package com.example.paint;

public class ShapeDto {
    private final Point pointStart;
    private final Point pointEnd;
    private final Color Color;
    public Point getPointStart() {
        return pointStart;
    }
    public Point getPointEnd() {
        return pointEnd;
    }
    public Color getColor() {
        return Color;
    }
    public ShapeDto(Point pointStart, Point pointEnd, com.example.paint.Color color) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
        Color = color;
    }
}
