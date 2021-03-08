package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(int maxRadioStation, int currentRadioStation, boolean on, int expected) {
        Radio radio = new Radio(maxRadioStation,currentRadioStation,on);
        radio.next();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNext.csv")
    void prevRadioStation(int maxRadioStation, int currentRadioStation, boolean on, int expected) {
        Radio radio = new Radio(maxRadioStation,currentRadioStation,on);
        radio.prev();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInput.csv")
    void inputRadioStation(int maxRadioStation, int currentRadioStation, boolean on, int expected) {
        Radio radio = new Radio(maxRadioStation,currentRadioStation,on);
        radio.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIn.csv")
    void increaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radio radio = new Radio(on, currentSoundVolume);
        radio.increaseSoundVolume();

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDec.csv")
    void decreaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radio radio = new Radio(on, currentSoundVolume);
        radio.decreaseSoundVolume();

        assertEquals(expected, radio.getCurrentSoundVolume());
    }
}
