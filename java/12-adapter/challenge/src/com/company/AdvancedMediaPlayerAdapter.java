package com.company;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMediaPlayer.loadFilename(filename);
        advancedMediaPlayer.listen();
    }
}
