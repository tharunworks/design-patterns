package com.tharunworks.patterns.command.example1.before;

public class CommandClient {

    public void start(){
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        remoteControl.remoteButtonPressed("light", "on", light);

        Light light1 = new Light();
        remoteControl.remoteButtonPressed("light", "on", light1);

        SteeringWheel steeringWheel = new SteeringWheel();
        remoteControl.remoteButtonPressed("steeringwheel", "turnleft", steeringWheel);
    }
}
