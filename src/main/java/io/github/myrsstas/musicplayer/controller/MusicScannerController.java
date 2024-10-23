package io.github.myrsstas.musicplayer.controller;

import java.io.File;
import java.util.List;


public interface MusicScannerController {

    List<File> getMusicFilesInDirectoryPath(String path);

}
