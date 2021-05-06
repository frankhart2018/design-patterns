package com.company;

public interface AdvancedMediaPlayer {
    public void loadFilename(String filename);
    public void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        System.out.println("Loading VLC file " + filename);
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Listening to VLC file " + this.filename);
    }
}

class Mp4Player implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        System.out.println("Loading mp4 file " + filename);
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Listening to mp4 file " + this.filename);
    }
}
