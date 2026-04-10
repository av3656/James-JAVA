package com.vermatradingcompany.corejava.interfaces.devices;

public class SmartPhone implements Camera, MusicPlayer, laptop {
    @Override
    public void capturingPhotoes() {
        System.out.println("camera is capturing photoes.");
    }

    @Override
    public void recordingVideo() {
        System.out.println("Camera is recording videos.");
    }

    @Override
    public void playingMusic() {
        System.out.println("It is playing music.");
    }

    @Override
    public void stopPlaying() {
        System.out.println("Music gets stopped.");
    }

    @Override
    public void internetBorwsing() {
        System.out.println("In the laptop i am browsing internet.");
    }

    @Override
    public void preparingExcel() {
        System.out.println("Now i am preparing for the excel sheet.");
    }
}
