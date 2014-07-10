package it.mario.tdd.fizzbuzzkata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGameTest {

    @Test
    public void testNumberDivisibleBy3IsFizz() {
        assertEquals(FizzBuzzGame.FIZZ, FizzBuzzGame.play(3));
    }

    @Test
    public void testNumberDivisibleBy5IsBuzz() {
        assertEquals(FizzBuzzGame.BUZZ, FizzBuzzGame.play(5));
    }

    @Test
    public void testNumberDivisibleBy3And5IsFizzBuzz() {
        assertEquals(FizzBuzzGame.FIZZ+FizzBuzzGame.BUZZ, FizzBuzzGame.play(15));
    }

    @Test
    public void testNumberNotDivisibleBy3Or5IsSameNumber() {
        assertEquals("1", FizzBuzzGame.play(1));
    }
}