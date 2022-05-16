package ru.netology.domain;

public class Radio {
    private int id;

    private int station;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int volume;
    private boolean on;

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }

    public void nextStation() {
        if (station == 9) {
            station = 0;
        } else {
            station = station + 1;
        }
    }

    public void prevStation() {
        if (station == 0) {
            station = 9;
        } else {
            station = station - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;

    }

    public void plusVolume() {
        if (volume == maxVolume) {
            volume = maxVolume;
        } else {
            volume = volume + 1;
        }

    }

    public void minusVolume() {
        if (volume == minVolume) {
            volume = minVolume;
        } else {
            volume = volume - 1;
        }
    }

}

