package com.tharunworks.patterns.command.example1.after;

public class Light {

    private String on = "Switch on Light ", off = "Switch off Light ";

    public void on(){
        System.out.println(this.on + this.hashCode());
    }

    public void off(){
        System.out.println(this.off + this.hashCode());
    }
}
