package com.example.paint;

import java.util.function.Consumer;

public class AppPaint {
    private final CommandFactory commands;
    private final Canvas canvas;
    public AppPaint(Consumer<String> printer){
        canvas = canvasFactory(printer);
        commands = commandFactory();        
    }
    public void run(String commnad, String Color){
        commands.getCommand(commnad, canvas, null).execute();;
    }
    static CommandFactory commandFactory(){
        var commandFactory = new CommandFactoryImpl();
        commandFactory.register("add", (canvas,shape)->new CommandAdd(canvas, shape));
        commandFactory.register("remove", (canvas,shape)->new CommandRemove(canvas, shape));
        return commandFactory;
    }
    static Canvas canvasFactory(Consumer<String> printer){
        return new CanvasImpl(printer);
    }
    static ColorFactory colorFactory(){
        var colorFactory = new ColorFactoryImpl();
        colorFactory.register("black", new Color(0,0,0));
        colorFactory.register("white", new Color(255,255,255));
        return colorFactory;
    }
    static ShapeFactory shapeFactory(){
        var shapeFactory = new ShapeFactoryImpl();
        shapeFactory.register("rectangulo", dto->new Rectangle(dto.pointStart, dto.pointEnd, dto.Color));
        shapeFactory.register("circle", dto->new Circle(dto.pointStart, dto.pointEnd, dto.Color));
        return shapeFactory;
    }
}
