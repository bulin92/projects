import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void eightNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nineNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nullNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void firstNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();


        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nullPrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void firstPrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void eightPrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();


        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ninePrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();


        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightNegativeStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightNullStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightFirstStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightEightStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);


        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightNineStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightTenStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightNegativeVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightNullVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightOneVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightNightyNineVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);


        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightHundredVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rightHundredOneVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ninetyNineIncreaseTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void hundredIncreaseTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nullIncreaseTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void oneIncreaseTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();


        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ninetyNineDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumeDown();


        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void hundredDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeDown();


        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void oneDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.volumeDown();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nullDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeQuantityStationTest() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(33);


        int expected = 33;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void equalQuantityStationTest() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(34);


        int expected = 34;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void highQuantityStationTest() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(35);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void oneQuantityStationTest() {
        Radio radio = new Radio(1);
        radio.setCurrentStation(0);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }




}

