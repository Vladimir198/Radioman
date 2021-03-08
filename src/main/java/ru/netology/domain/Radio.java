package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume;
    private int currentSoundVolume;
    private boolean on;

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
    public void inputUser() {
        if (!on) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
    }
}
