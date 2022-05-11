package ru.netology.domain;

public class Radio {
    private int station;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int volume;
    // private boolean on;

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        station = newStation;
    }

    public void nextStation() {
        if (station == 9) {
            station = 0;
            return;
        }
        if (station < 9) {
            station = station + 1;
        }
        if (station > 9) {
            station = 0;

        }
    }

    public void prevStation() {
        if (station == 0) {
            station = 9;
            return;
        }
        if (station > 0) {
            station = station - 1;
        }
        if (station < 0) {
            station = 0;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void plusVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
        if (volume == maxVolume) {
            volume = maxVolume;
        }
        if (volume > maxVolume) {
            volume = maxVolume;
        }
    }

    public void minusVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
        if (volume == minVolume) {
            volume = minVolume;
        }
        if (volume < minVolume) {
            volume = minVolume;
        }
    }
}

