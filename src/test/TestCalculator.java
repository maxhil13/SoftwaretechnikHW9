package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        // Implement
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @ParameterizedTest
    @CsvSource({"5, 7", "10, 7", "15, 3", "11, 14"})
    public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
        // Implement
        int result = calculator.add(valueOne, valueTwo) - valueTwo;

        Assertions.assertEquals(valueOne, result);
    }

    @Test
    public void Should_substract_two_numbers_and_return_result() {
        // Implement
        Assertions.assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        // Implement
        Assertions.assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        // Implement
        Assertions.assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        // Implement
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });

        String expectedMessage = "ZeroDivisionError";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}