package Baitap.Automated_Testing_TDD.FizzBuzzTranslate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    void checkFizzBuzz() {
        String expected = "Fizz";
        String result = FizzBuzzTranslate.checkFizzBuzz(12);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz2() {
        String expected = "Fizz";
        String result = FizzBuzzTranslate.checkFizzBuzz(23);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz3() {
        String expected = "Buzz";
        String result = FizzBuzzTranslate.checkFizzBuzz(25);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz4() {
        String expected = "Buzz";
        String result = FizzBuzzTranslate.checkFizzBuzz(56);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz5() {
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.checkFizzBuzz(15);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz6() {
        String expected = "hai sáu";
        String result = FizzBuzzTranslate.checkFizzBuzz(26);
        assertEquals(expected, result);
    }
    @Test
    void checkFizzBuz7() {
        String expected = "chín tám";
        String result = FizzBuzzTranslate.checkFizzBuzz(98);
        assertEquals(expected, result);
    }

}
