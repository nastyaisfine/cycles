package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCount() {

        SQRService service = new SQRService();
        int actual = service.sqrtceil(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void Reverse() {
        SQRService service = new SQRService();
        int actual = service.sqrtceil(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Zero() {
        SQRService service = new SQRService();
        int actual = service.sqrtceil(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SmallValue() {
        SQRService service = new SQRService();
        int actual = service.sqrtceil(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Negative() {
        SQRService service = new SQRService();
        int actual = service.sqrtceil(-300, -400);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Same() {
        SQRService service = new SQRService();
        int actual = service.sqrtceil(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotRound() {
        SQRService service = new SQRService();
        double actual = service.sqrtceil(15,155);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}