package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenAllElementAreTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFirthAndThirdElementAreFalseThenFalse() {
        boolean[] input = new boolean[] {false, true, false};
        boolean result = Check.mono(input);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    @Test
    public void whenAllElementsAreFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }
}