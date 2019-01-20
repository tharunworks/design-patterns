package com.tharunworks.patterns.command.example1.after;

public class SteeringWheel{

    private String turnLeft = "Turn Steering wheel Left ", turnRight = "Turn Steering wheel Right ";

    public void toTurnLeft(){
        System.out.println(this.turnLeft + this.hashCode());
    }

    public void toTurnRight(){
        System.out.println(this.turnRight + this.hashCode());
    }

}
