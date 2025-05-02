package io.github.myrsstas.musicplayer.controllers;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayerControllerImpl implements MusicPlayerController {
    @Override
    public void playSong(String songPath) {
        File file = new File(songPath);
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (UnsupportedAudioFileException | IOException |LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pauseSong() {

    }

    @Override
    public void replaySong() {

    }
}
