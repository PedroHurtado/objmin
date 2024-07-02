package com.example.paint;

/*
 * String command
String shape
String color
Point PointStart
Point PointEnd
 */
public class AddRunDto {
    private final String command;
    private final String shape;
    private final String color;
    private final Point pointStart;
    private final Point pintEnd;
    public AddRunDto(String command, String shape, String color, Point pointStart, Point pintEnd) {
        this.command = command;
        this.shape = shape;
        this.color = color;
        this.pointStart = pointStart;
        this.pintEnd = pintEnd;
    }
    public String getCommand() {
        return command;
    }
    public String getShape() {
        return shape;
    }
    public String getColor() {
        return color;
    }
    public Point getPointStart() {
        return pointStart;
    }
    public Point getPintEnd() {
        return pintEnd;
    }
}
