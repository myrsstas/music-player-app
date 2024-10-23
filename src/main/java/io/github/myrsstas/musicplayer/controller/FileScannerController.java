package io.github.myrsstas.musicplayer.controller;

import java.io.File;
import java.util.List;

public interface FileScannerController {

    List<File> getFilesInDirectoryPath(String path);

}
