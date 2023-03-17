package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testRadio(){
        Radio radio = new Radio(20);
        radio.setCurrentChannelNum (10);
        int expected = 10;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadioPrev(){
        Radio radio = new Radio(20);
        radio.setCurrentChannelNum (0);
        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadioNext(){
        Radio radio = new Radio(20);
        radio.setCurrentChannelNum (19);
        int expected = 19;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadioAboveMax(){
        Radio radio = new Radio(20);
        radio.setCurrentChannelNum (21);
        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(85);

        int expected = 85;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
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

        int expected = 20;
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

        int expected = 20;
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
        radio.setCurrentChannelNum(20);
        radio.next();


        int expected = 0;
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
    public void currentChannelNumUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(-1);

        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentChannelNumLast() {
        Radio radio = new Radio();
        radio.setCurrentChannelNum(20);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChannelNum();
        Assertions.assertEquals(expected, actual);
    }

}











