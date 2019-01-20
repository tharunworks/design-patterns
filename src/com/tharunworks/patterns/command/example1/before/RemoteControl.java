package com.tharunworks.patterns.command.example1.before;

public class RemoteControl {

    private Light light;

    private SteeringWheel steeringWheel;

    public void remoteButtonPressed(String thing, String action, Object object) {
        /*
        * Need to explicitly add for every new thing with actions
         */
        if (thing.equalsIgnoreCase("light") && action.equalsIgnoreCase("on")) {
            this.light = (Light) object;
            this.light.on();
        } else if (thing.equalsIgnoreCase("light") && action.equalsIgnoreCase("off")) {
            this.light = (Light) object;
            this.light.off();
        } else if (thing.equalsIgnoreCase("steeringwheel") && action.equalsIgnoreCase("turnleft")) {
            this.steeringWheel = (SteeringWheel) object;
            this.steeringWheel.toTurnLeft();
        } else if (thing.equalsIgnoreCase("steeringwheel") && action.equalsIgnoreCase("turnright")) {
            this.steeringWheel = (SteeringWheel) object;
            this.steeringWheel.toTurnRight();
        }

    }
}
