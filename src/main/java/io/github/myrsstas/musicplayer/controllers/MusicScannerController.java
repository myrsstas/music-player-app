package io.github.myrsstas.musicplayer.controllers;

import io.github.myrsstas.musicplayer.models.SongModel;

import java.io.File;
import java.util.List;


public interface MusicScannerController {

    List<File> getMusicFilesInDirectoryPath(String path);
    List<SongModel> convertFilesToSongs(List<File> files);

}
