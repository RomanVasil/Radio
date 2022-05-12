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
        return;
    }

    public void nextStation() {
        if (station >= 9) {
            station = 0;
            return;
        }
        if (station >= 0) {
            station = station + 1;
            // return;
        }
        if (station < 0) {
            station = 0;
        }
        return;
    }

    public void prevStation() {
        if (station <= 0) {
            station = 9;
            return;
        }
        if (station <= 9) {
            station = station - 1;
            //  return;
        }
        if (station > 9) {
            station = 0;
        }
        return;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
        return;
    }

    public void plusVolume() {
        if (volume >= maxVolume) {
            volume = maxVolume;
            return;
        }
        if (volume >= minVolume) {
            volume = volume + 1;
            // return;
        }
        if (volume < minVolume) {
            volume = 0;
            // return;
        }
        return;
    }

    public void minusVolume() {
        if (volume <= minVolume) {
            volume = minVolume;
            return;
        }
        if (volume <= maxVolume) {
            volume = volume - 1;
            // return;
        }
        if (volume > maxVolume) {
            volume = maxVolume;
            //return;
        }
        return;
    }
}

