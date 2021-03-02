package ru.netology.domain;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxSoundVolume = 10;
    private int minSoundVolume;
    private int currentSoundVolume;
    private boolean on;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (!on) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void next() {
        if (!on) {
            return;
        }
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prev() {
        if (!on) {
            return;
        }
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
    public void increaseSoundVolume() {
        if (!on) {
            return;
        }
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (!on) {
            return;
        }
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        }
    }
}
