package com.tharunworks.patterns.command.example1.after;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light1){
        this.light = light1;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
