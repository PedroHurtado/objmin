package com.example.paint;

import java.util.function.Consumer;

public class Configuration {
    public static CommandFactory createCommands(){
        var commandFactory = new CommandFactoryImpl();
        commandFactory.register("add", (canvas,shape)->new CommandAdd(canvas, shape));
        commandFactory.register("remove", (canvas,shape)->new CommandRemove(canvas, shape));
        return commandFactory;
    }
    public static Canvas createCanvas(Consumer<String> printer){
        return new CanvasImpl(printer);
    }
    public static ColorFactory createColors(){
        var colorFactory = new ColorFactoryImpl();
        colorFactory.register("black", new Color(0,0,0));
        colorFactory.register("white", new Color(255,255,255));
        return colorFactory;
    }
    public static ShapeFactory createShapes(){
        var shapeFactory = new ShapeFactoryImpl();
        shapeFactory.register("rectangle", dto->new Rectangle(dto.getPointStart(), dto.getPointEnd(), dto.getColor()));
        shapeFactory.register("circle", dto->new Circle(dto.getPointStart(), dto.getPointEnd(), dto.getColor()));
        shapeFactory.register("cuadrado", dto->new Cuadrado(dto.getPointStart(), dto.getPointEnd(), dto.getColor()));
        return shapeFactory;
    }
}
