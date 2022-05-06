package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldUseRadioStation() {
        Radio radioSt = new Radio();
        radioSt.setStation(9);
        int expected = 0;
        int actual = radioSt.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioPlusVolume() {
        Radio radioPlusVol = new Radio();
        radioPlusVol.setPlusVolume(9);
        int expected = 10;
        int actual = radioPlusVol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseRadioMinusVolume() {
        Radio radioMinusVol = new Radio();
        radioMinusVol.setMinusVolume(9);
        int expected = 8;
        int actual = radioMinusVol.getVolume();

        assertEquals(expected, actual);
    }
}



