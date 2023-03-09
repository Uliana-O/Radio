package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(13);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void currentChannelNumPrevZero() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelNumPrev() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelNumPrevAfterZero() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelNumNext() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(7);
        radio.next();

        int expected = 8;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelNumNextAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(10);
        radio.next();


        int expected = 1;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelNumNextAfterZero() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentChannelNum2() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(-2);

        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelNumUnderNine() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(-1);

        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentChannelNumLast() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
}











