package com.example.paint;

public class CommandAdd extends CommandBase {

    private final AddShape receiver;
    private final Shape data;
    public CommandAdd(final AddShape receiver, final Shape data){
        this.receiver =receiver;
        this.data = data;
    }
    @Override
    public void execute() {
        receiver.add(data);
    }
    
}
