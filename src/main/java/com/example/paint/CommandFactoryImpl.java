package com.example.paint;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class CommandFactoryImpl implements CommandFactory {
    private final Map<String,BiFunction<Canvas, Shape, CommandBase>> commands = new HashMap<>(); 
    public void register(String key, BiFunction<Canvas, Shape, CommandBase> command){
        commands.put(key, command);
    }
    @Override
    public CommandBase getCommand(String key, Canvas canvas, Shape shape){
        var command = commands.get(key);        
        if(command == null){
            throw new RuntimeException();
        }
        return command.apply(canvas, shape);
    }
}
