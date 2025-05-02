package io.github.myrsstas.musicplayer.controllers;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayerControllerImpl implements MusicPlayerController {

    private MediaPlayer mediaPlayer;

    @Override
    public void playSong(String songPath) {
        Media media = new Media(songPath);
        mediaPlayer = new MediaPlayer(media);
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
    }

    @Override
    public void pauseSong() {

    }

    @Override
    public void replaySong() {

    }
}
