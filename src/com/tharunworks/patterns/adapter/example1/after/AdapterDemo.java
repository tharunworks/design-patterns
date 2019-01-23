package com.tharunworks.patterns.adapter.example1.after;

public class AdapterDemo {

    /*
    * Need to make Flvplayer to play Mp4 videos
     */
    public void start(){
        FlvVideo flvVideo = new FlvVideo();
        FlvPlayer flvPlayer = new FlvPlayer(flvVideo);
        flvPlayer.startVideo();
        System.out.println("\n\n");

        /*
        * Pass Mp4 video instead of Flv video for the FlvPlayer.
        * Without Adapter Flvplayer couldn't able to execute Mp4 video.
         */
        Mp4Video mp4Video = new Mp4Video();
        FlvToMp4Adapter flvToMp4Adapter = new FlvToMp4Adapter(mp4Video);
        FlvPlayer flvPlayer1 = new FlvPlayer(flvToMp4Adapter);
        flvPlayer1.startVideo();
    }
}
