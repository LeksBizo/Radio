import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test

    public void StationCheckCorrect(){

        Radio radio = new Radio();

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void StationCheckIncorrectMore(){

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test

    public void StationCheckIncorrectNegativeNumber(){

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void StationCheckZero(){

        Radio radio = new Radio();

        radio.setCurrentStation(4);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test //проверяем переключение базовое с 6 на 7
    public void StationCheckNextStation(){

        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test //проверяем переключение с 9 на 0
    public void StationCheckNextStationStart(){

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test //проверяем переключение с 3 на 2
    public void StationCheckPrevStation(){

        Radio radio = new Radio();

        radio.setCurrentStation(3);

        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test //проверяем переключение с 9 на 0
    public void StationCheckPrevStationEnd(){

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test

    public void VolumeCheckCorrect(){

        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        int expected = 20;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void VolumeCheckIncorrectMore(){

        Radio radio = new Radio();

        radio.setCurrentVolume(115);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void VolumeCheckIncorrectNegativeNumber(){

        Radio radio = new Radio();

        radio.setCurrentVolume(-12);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void VolumeCheckZero(){

        Radio radio = new Radio();

        radio.setCurrentVolume(40);
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test //проверяем переключение громкости  с 0 на 1
    public void VolumeCheckNextVolume(){

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.next2();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test //проверяем переключение громкости  с 100 на 99
    public void VolumeCheckPrevVolume(){

        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.prev2();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

}