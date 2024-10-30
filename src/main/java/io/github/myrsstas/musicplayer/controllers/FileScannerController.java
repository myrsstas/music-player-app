package io.github.myrsstas.musicplayer.controllers;

import java.io.File;
import java.util.List;

public interface FileScannerController {

    List<File> getFilesInDirectoryPath(String path);

}
