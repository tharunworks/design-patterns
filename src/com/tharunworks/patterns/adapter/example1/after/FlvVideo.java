package com.tharunworks.patterns.adapter.example1.after;

public class FlvVideo implements FlvFormat {

    @Override
    public void play() {
        System.out.println("Playing Flv format video");
    }
}
