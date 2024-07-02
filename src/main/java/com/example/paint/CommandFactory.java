package com.example.paint;

public interface CommandFactory {

    CommandBase getCommand(String key, Canvas canvas, Shape shape);

}