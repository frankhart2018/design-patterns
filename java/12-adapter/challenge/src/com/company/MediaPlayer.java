package com.company;

public interface MediaPlayer {
    public void play(String audioType, String filename);
}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String filename) {
        System.out.println("Audio type = " + audioType + ", file name = " + filename);
    }
}
