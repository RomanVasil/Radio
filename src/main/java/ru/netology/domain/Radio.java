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

    public int setStation(int newStation) {
        station = newStation;
        if (newStation == 9) {
            this.station = 0;
        }
        if (newStation >= 0 && newStation < 9) {
            this.station = newStation + 1;
        }
        if (newStation > 9){
            this.station = 0;
        }

        return station;
    }

    public int setPrevStation(int newStation) {
        station = newStation;
        if (newStation == 0) {
            this.station = 9;
        }
        if (newStation > 0 && newStation <= 9) {
            this.station = newStation - 1;
        }
        if (newStation < 0){
            this.station = 0;
        }
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public int setPlusVolume(int newVolume) {
        volume = newVolume;
        if (newVolume < maxVolume) {
            this.volume = volume + 1;
        }
        if (newVolume == maxVolume) {
            this.volume = maxVolume;
        }
        if (newVolume > maxVolume) {
            this.volume = maxVolume;
        }
        return volume;
    }

    public int setMinusVolume(int newVolume) {
        volume = newVolume;
        if (newVolume < maxVolume && newVolume > minVolume) {
            this.volume = newVolume - 1;
        }
        if (newVolume == minVolume) {
            this.volume = minVolume;
        }
        if (newVolume < minVolume) {
            this.volume = minVolume;
        }
        return volume;
    }
}

