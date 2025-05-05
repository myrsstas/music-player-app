package io.github.myrsstas.musicplayer.controllers;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class MusicPlayerControllerImpl implements MusicPlayerController {
    private Player playFile;
    private Thread playerThread;

    @Override
    public void playSong(String songPath) {
        try {
            FileInputStream fis = new FileInputStream(songPath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            playFile = new Player(bis);

            playerThread = new Thread(()->{
                try {
                    playFile.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            playerThread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stopSong() {
        if (playFile != null) {
            playFile.close();
        }
    }

}
