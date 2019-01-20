package com.tharunworks.patterns.command.example1.after;

public class SteeringWheelOnCommand implements Command {

    private SteeringWheel steeringWheel;

    public SteeringWheelOnCommand(SteeringWheel steeringWheel1){
        this.steeringWheel = steeringWheel1;
    }

    @Override
    public void execute() {
        this.steeringWheel.toTurnLeft();
    }
}
