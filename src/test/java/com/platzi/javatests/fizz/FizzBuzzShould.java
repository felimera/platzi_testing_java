package com.platzi.javatests.fizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzShould {
    @Test
    public void number_divisible_to_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void number_divisible_to_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void number_divisible_to_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void otherwise_it_returns_the_same_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(2), is("2"));
        assertThat(fizzBuzz.fizzBuzz(16), is("16"));
    }
}