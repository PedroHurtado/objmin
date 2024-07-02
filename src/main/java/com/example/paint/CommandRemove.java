package com.example.paint;

public class CommandRemove extends CommandBase {

    private final RemoveShape receiver;
    private final Shape data;
    public CommandRemove(RemoveShape receiver, Shape data){
        this.receiver = receiver;
        this.data = data;
    }
    @Override
    public void execute() {
        receiver.remove(data);
    }
    
}
