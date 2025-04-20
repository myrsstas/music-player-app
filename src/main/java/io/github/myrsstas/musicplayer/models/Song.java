package io.github.myrsstas.musicplayer.models;

public class Song {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song(String title) {
        this.title = title;
    }
}
