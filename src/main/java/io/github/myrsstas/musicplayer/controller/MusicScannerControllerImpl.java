package io.github.myrsstas.musicplayer.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MusicScannerControllerImpl implements MusicScannerController {
    private final FileScannerController fileScannerController;
    private final List<String> musicExtensions;

    public MusicScannerControllerImpl(FileScannerController fileScannerController) {
        this.fileScannerController = fileScannerController;
        this.musicExtensions = Arrays.asList("mp3", "flac", "wav");
    }

    @Override
    public List<File> getMusicFilesInDirectoryPath(String path) {

        List<File> fileContent = fileScannerController.getFilesInDirectoryPath(path);
        List<File> musicFiles = new ArrayList<>();
        for (File file : fileContent) {
            if (file.isDirectory()) {
                continue;
            }
            String fileName = file.getName();

            if (!fileName.contains(".")) {
                continue;
            }
            String[] fileNameParts = fileName.split("\\.");
            String fileExtension = fileNameParts[fileNameParts.length - 1];

            if (!musicExtensions.contains(fileExtension)) {
                continue;

            }
            musicFiles.add(file);
            System.out.println(file.getName());

//            if (fileName.endsWith(".mp3")||fileName.endsWith(".flac") || fileName.endsWith(".wav")) {
//                musicFiles.add(file);
//                System.out.println(file.getName());
//            }

        }

        return musicFiles;
    }
}
