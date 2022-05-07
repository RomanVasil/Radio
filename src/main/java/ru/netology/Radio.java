package ru.netology;

public class Radio {
    private int station;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int volume;
    private boolean on;

    public int getStation() {
        return station;
    }

    public int setStation(int station) {
        if (station == 9) {
            this.station = 0;
        }
        if (station >= 0 && station < 9) {
            this.station = station + 1;
        }
        return station;
    }

    public int setPrevStation(int station) {
        if (station == 0) {
            this.station = 9;
        }
        if (station > 0 && station <= 9) {
            this.station = station - 1;
        }
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public int setPlusVolume(int volume) {
        if (volume < maxVolume) {
            this.volume = volume + 1;
        }
        if (volume == maxVolume) {
            this.volume = maxVolume;
        }
        if (volume > maxVolume) {
            this.volume = maxVolume;
        }
        return volume;
    }

    public int setMinusVolume(int minusVolume) {
        if (minusVolume < maxVolume && minusVolume > minVolume) {
            this.volume = minusVolume - 1;
        }
        if (minusVolume == minVolume) {
            this.volume = minVolume;
        }
        return volume;
    }
}

