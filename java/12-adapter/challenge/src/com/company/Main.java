package com.company;

public class Main {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "myfile.mp3");

        MediaPlayer vlcPlayer = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        vlcPlayer.play("vlc", "myfile.vlc");

        MediaPlayer mp4Player = new AdvancedMediaPlayerAdapter(new Mp4Player());
        mp4Player.play("mp4", "myfile.mp4");
    }
}
