package ru.netology.domain;

public class Radio {
    private int id;
    private String name = "Solo";
    private int station;
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = calculateMaxStation();
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;
    private boolean on;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {
    }

    public int calculateMaxStation() {
        return amountStation - 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStation() {
        return station;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setStation(int station) {
        maxStation = calculateMaxStation();
        if (station > maxStation) {
            return;
        }
        if (station < minStation) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station == maxStation) {
            this.station = 0;
        } else {
            this.station = station + 1;
        }
    }

    public void prevStation() {
        if (station == minStation) {
            station = maxStation;
        } else {
            station = station - 1;
        }
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public void plusVolume() {
        if (volume == maxVolume) {
            volume = maxVolume;
        } else {
            this.volume = volume + 1;
        }
    }

    public void minusVolume() {
        if (volume == minVolume) {
            volume = minVolume;
        } else {
            this.volume = volume - 1;
        }
    }
}

