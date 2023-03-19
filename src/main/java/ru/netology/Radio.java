package ru.netology;

public class Radio {
    private int currentChannelNum;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        maxStation = 20;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }


    public int getCurrentChannelNum() {
        return currentChannelNum;
    }

    public void setCurrentChannelNum(int currentChannelNum) {
        if (currentChannelNum < 0) {
            return;
        }
        if (currentChannelNum > maxStation) {
            return;
        }
        this.currentChannelNum = currentChannelNum;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentChannelNum != maxStation) {
            currentChannelNum++;
        } else {
            currentChannelNum = 0;

        }
    }

    public void prev() {
        if (currentChannelNum != 0) {
            currentChannelNum--;
        } else {
            currentChannelNum = 20;
        }
    }
}








