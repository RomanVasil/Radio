package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio1 = new Radio(12);
    Radio radio = new Radio();

    // след станция
    @Test
    public void shouldUseNextRadioStation8() {
        radio.setStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNextRadioStation9() {
        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNextRadioStation10() {
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNextRadioStationMinus1() {

        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNextRadio1Station10() {
        radio1.setStation(10);
        radio1.nextStation();
        int expected = 11;
        int actual = radio1.getStation();

        assertEquals(expected, actual);
    }

    @Test //ошибка
    public void shouldUseNextRadio1Station11() {

        radio1.setStation(11);
        radio1.nextStation();
        int expected = 0;
        int actual = radio1.getStation();

        assertEquals(expected, actual);
    }

    @Test   //ошибка
    public void shouldUseNextRadio1Station12() {
        radio1.setStation(12);
        int expected = 0;
        int actual = radio1.getStation();

        assertEquals(expected, actual);
    }

    // предыд станция
    @Test
    public void shouldUsePrevRadioStation1() {
        radio.setStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadioStation0() {
        radio.setStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadioStationMin1() {
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadioStation10() {
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadio1Station0() {
        radio1.setStation(0);
        radio1.prevStation();
        int expected = 11;
        int actual = radio1.getStation();

        assertEquals(expected, actual);
    }

    // увелич громк
    @Test
    public void shouldUseRadioPlusVolumeMinus1() {
        radio.setVolume(-1);
        // radioPlusVol.plusVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume99() {
        radio.setVolume(99);
        radio.plusVolume();
        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume100() {
        radio.setVolume(100);
        radio.plusVolume();
        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume101() {
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    // уменьш громкости
    @Test
    public void shouldUseRadioMinusVolume1() {
        radio.setVolume(1);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolume0() {
        radio.setVolume(0);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolumeMin1() {
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolume11() {
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }


}



