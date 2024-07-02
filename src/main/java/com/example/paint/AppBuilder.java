package com.example.paint;


public interface AppBuilder {
    AppBuilder setCommnads(CommandFactory commands);
    AppBuilder setCanvas(Canvas canvas);
    AppBuilder setColors(ColorFactory colors);
    AppBuilder setShapes(ShapeFactory shapes);
    AppPaint build();
}
