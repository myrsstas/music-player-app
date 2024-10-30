package io.github.myrsstas.musicplayer.controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileScannerControllerImpl implements FileScannerController {
    @Override
    public List<File> getFilesInDirectoryPath(String path) {

        if (path == null || path.isEmpty()) {
            return new ArrayList<>();
        }

        // Using File class create an object for specific directory
        File directory = new File(path);

        if (directory.isFile()) {
            return new ArrayList<>();
        }

        // Using listFiles method we get all the files of a directory
        // return type of listFiles is array
        File[] files = directory.listFiles();

        if (files == null) {
            return new ArrayList<>();
        }

        List<File> fileList = new ArrayList<>();

        for (File file : files) {

            if (file.isDirectory()) {
                continue;
            }

            fileList.add(file);
            System.out.println(file.getName());
        }

        return fileList;
    }

}
