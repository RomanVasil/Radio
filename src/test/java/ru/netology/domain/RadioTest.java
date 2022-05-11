package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldUseNextRadioStation8() {
        Radio nextRadioSt = new Radio();

        nextRadioSt.setStation(8);
        nextRadioSt.nextStation();
        int expected = 9;
        int actual = nextRadioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNextRadioStation9() {
        Radio nextRadioSt = new Radio();
        nextRadioSt.setStation(9);
        nextRadioSt.nextStation();
        int expected = 0;
        int actual = nextRadioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseNextRadioStation10() {
        Radio nextRadioSt = new Radio();
        nextRadioSt.setStation(10);
        nextRadioSt.nextStation();
        int expected = 0;
        int actual = nextRadioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadioStation() {
        Radio prevRadioSt = new Radio();
        prevRadioSt.setStation(1);
        prevRadioSt.prevStation();
        int expected = 0;

        int actual = prevRadioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadioStation0() {
        Radio prevRadioSt = new Radio();
        prevRadioSt.setStation(0);
        prevRadioSt.prevStation();
        int expected = 9;
        int actual = prevRadioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUsePrevRadioStationMin1() {
        Radio prevRadioSt = new Radio();
        prevRadioSt.setStation(-1);
        prevRadioSt.prevStation();
        int expected = 0;
        int actual = prevRadioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume9() {
        Radio radioPlusVol = new Radio();
        radioPlusVol.setVolume(9);
        radioPlusVol.plusVolume();
        int expected = 10;
        int actual = radioPlusVol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume10() {
        Radio radioPlusVol = new Radio();
        radioPlusVol.setVolume(10);
        radioPlusVol.plusVolume();
        int expected = 10;
        int actual = radioPlusVol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume11() {
        Radio radioPlusVol = new Radio();
        radioPlusVol.setVolume(11);
        radioPlusVol.plusVolume();
        int expected = 10;
        int actual = radioPlusVol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolume1() {
        Radio radioMinusVol = new Radio();
        radioMinusVol.setVolume(1);
        radioMinusVol.minusVolume();
        int expected = 0;
        int actual = radioMinusVol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolume0() {
        Radio radioMinusVol = new Radio();
        radioMinusVol.setVolume(0);
        radioMinusVol.minusVolume();
        int expected = 0;
        int actual = radioMinusVol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolumeMin1() {
        Radio radioMinusVol = new Radio();
        radioMinusVol.setVolume(-1);
        radioMinusVol.minusVolume();
        int expected = 0;
        int actual = radioMinusVol.getVolume();

        assertEquals(expected, actual);
    }

}



