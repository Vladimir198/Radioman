package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);

        radio.next();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNext.csv")
    void prevRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prev();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInput.csv")
    void inputRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIn.csv")
    void increaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentSoundVolume(currentSoundVolume);
        radio.increaseSoundVolume();

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDec.csv")
    void decreaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentSoundVolume(currentSoundVolume);
        radio.decreaseSoundVolume();

        assertEquals(expected, radio.getCurrentSoundVolume());
    }
}
