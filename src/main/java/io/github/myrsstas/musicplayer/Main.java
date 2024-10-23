package io.github.myrsstas.musicplayer;

import io.github.myrsstas.musicplayer.controller.FileScannerController;
import io.github.myrsstas.musicplayer.controller.FileScannerControllerImpl;
import io.github.myrsstas.musicplayer.controller.MusicScannerController;
import io.github.myrsstas.musicplayer.controller.MusicScannerControllerImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Music Player!");

        String directoryPath ="D:\\Users\\myrsi\\Music\\Black Veil Brides - 2021 - The Phantom Tomorrow (24bit-44.1kHz)";
        FileScannerController fileScannerController = new FileScannerControllerImpl();
        MusicScannerController musicScannerController = new MusicScannerControllerImpl(fileScannerController);
        musicScannerController.getMusicFilesInDirectoryPath(directoryPath);

    }
}
