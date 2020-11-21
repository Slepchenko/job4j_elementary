package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);
    }

    @Test
    public void when25to28then3() {
        int expected = 3;
        int x1 = 2;
        int y1 = 5;
        int x2 = 2;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);
    }

    @Test
    public void when22to28then6() {
        int expected = 6;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);
    }
}