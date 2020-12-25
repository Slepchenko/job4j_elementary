package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test
    public void whenCalcFor5ThenOneHundredTwenty() {
        Fact fact = new Fact();
        int rsl = fact.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCalcForMinusThreeThenException() {
        Fact fact = new Fact();
        fact.calc(-3);
    }
}
