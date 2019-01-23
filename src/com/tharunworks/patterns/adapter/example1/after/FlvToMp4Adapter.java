package com.tharunworks.patterns.adapter.example1.after;

public class FlvToMp4Adapter implements FlvFormat {

    private Mp4Format mp4FormatVideo;

    FlvToMp4Adapter(Mp4Format mp4FormatVideo){
        this.mp4FormatVideo = mp4FormatVideo;
    }

    @Override
    public void play() {
        System.out.println("Converting the video format from Flv to Mp4");
        this.mp4FormatVideo.watch();
    }
}
