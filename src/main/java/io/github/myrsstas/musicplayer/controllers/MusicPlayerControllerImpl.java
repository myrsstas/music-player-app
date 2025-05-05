package io.github.myrsstas.musicplayer.controllers;


import javazoom.jl.player.Player;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MusicPlayerControllerImpl implements MusicPlayerController {
    @Override
    public void playSong(String songPath) {
        File file = new File(songPath);
        try{
            FileInputStream fis = new FileInputStream(songPath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            Player playFile = new Player(bis);
            playFile.play();
        } catch (Exception e) {
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
