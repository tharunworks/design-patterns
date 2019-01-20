package com.tharunworks.patterns.command.example1.after;

public class CommandClient {

    public void start(){
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        remoteControl.remoteButtonPressed(lightOnCommand);

        SteeringWheel steeringWheel = new SteeringWheel();
        Command steeringWheelOnCommand = new SteeringWheelOnCommand(steeringWheel);
        remoteControl.remoteButtonPressed(steeringWheelOnCommand);
    }
}
