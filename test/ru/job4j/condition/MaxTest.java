package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    // 3. Перегрузить метод max для трех чисел [#409209]
    @Test
    public void whenMax2Left3Top1Then2() {
        int result = Max.max(2, 3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5Left2Top1Then5() {
        int result = Max.max(5, 2, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2Left2Top2Then2() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2Left3Top1Bottom6Then6() {
        int result = Max.max(2, 3, 1, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax6Left3Top7Bottom6Then7() {
        int result = Max.max(6, 3, 7, 6);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax2Left3Top2Bottom3Then3() {
        int result = Max.max(2, 3, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2Left2Top2Bottom2Then2() {
        int result = Max.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }
}