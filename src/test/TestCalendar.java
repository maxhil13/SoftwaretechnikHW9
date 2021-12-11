package test;

import main.Calendar;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

class TestCalendar {

    @ParameterizedTest
    @ValueSource(strings = {"2004", "2008", "2012", "2016", "2020"})
    public void Should_return_true(int year) {
        // Implement
        Calendar leapYear = new Calendar(year);

        Assertions.assertTrue(leapYear.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(strings = {"2005", "2006", "2007", "2009", "2010"})
    public void Should_return_false(int year) {
        // Implement
        Calendar leapYear = new Calendar(year);

        Assertions.assertFalse(leapYear.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(strings = {"3564", "2468", "1398", "4573", "2378"})
    public void Should_return_if_year_is_leap(int year) {
        // Implement
        Calendar leap = new Calendar(year);
        GregorianCalendar leapYear = new GregorianCalendar();
        Assertions.assertEquals(leap.isLeapYear(), leapYear.isLeapYear(year));
    }

    // Create a new method for boundary testing
    @ParameterizedTest
    @ValueSource(strings = {"-1", "-2", "-3", "-4", "-5"})
    public void Should_return_false_if_negative(int year) {
        // Implement
        Calendar leapYear = new Calendar(year);

        Assertions.assertFalse(leapYear.isLeapYear());
    }
}