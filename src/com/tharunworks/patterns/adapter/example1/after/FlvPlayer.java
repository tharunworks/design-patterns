package com.tharunworks.patterns.adapter.example1.after;

public class FlvPlayer {

    private FlvFormat video;

    FlvPlayer(FlvFormat video){
        this.video = video;
    }

    public void startVideo(){
        this.video.play();
    }
}
