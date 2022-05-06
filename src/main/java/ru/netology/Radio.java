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
    public int setStation(int station){
        if (station == 9) {
             this.station = 0;
        }
        else {
            this.station = station + 1;
        }
        return station;
    }

    public int getVolume(){
        return volume;
    }
    public int setPlusVolume(int plusVolume){
        if (plusVolume < maxVolume){
            this.volume = plusVolume + 1;
        }
        if(plusVolume == maxVolume){
            this.volume = maxVolume;
        }
        return volume;
    }
    public int setMinusVolume(int minusVolume){
        if (minusVolume < maxVolume && minusVolume > minVolume){
            this.volume = minusVolume - 1;
        }
        if(minusVolume == minVolume){
            this.volume = minVolume;
        }
        return volume;
    }
}

