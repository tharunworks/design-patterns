package com.tharunworks.patterns.command.example1.after;

public class RemoteControl {

    private Command slot;

    public void remoteButtonPressed(Command command) {
        this.slot = command;
        this.slot.execute();
    }

}
