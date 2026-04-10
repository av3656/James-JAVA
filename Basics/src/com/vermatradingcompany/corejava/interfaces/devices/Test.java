package com.vermatradingcompany.corejava.interfaces.devices;

public interface Test {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.capturingPhotoes();
        smartphone.internetBorwsing();
        smartphone.capturingPhotoes();smartphone.preparingExcel();
        smartphone.recordingVideo();
        smartphone.stopPlaying();
    }
}
