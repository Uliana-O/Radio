package ru.netology;

public class Radio {
    private int currentChannelNum;
    private int currentVolume;

    public int getCurrentChannelNum() {
        return currentChannelNum;
    }

    public void setCurrentChannelNum(int currentChannelNum) {
        if (currentChannelNum < 0) {
            return;
        }
        if (currentChannelNum > 9) {
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
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentChannelNum != 9) {
            currentChannelNum++;
        } else {
            currentChannelNum = 0;

        }
    }

    public void prev() {
        if (currentChannelNum != 0) {
            currentChannelNum--;
        } else {
            currentChannelNum = 9;
        }
    }
}








