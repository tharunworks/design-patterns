package com.tharunworks.patterns.adapter.example1.after;

public class Mp4Video implements Mp4Format {

    @Override
    public void watch() {
        System.out.println("Playing MP4 format video");
    }
}
