package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leapYearTest {


    //Is Leap Year
    @Test
    @DisplayName("Test that year is dividable by 4, but not 100")
    void If_year_is_dividable_by_4_but_not_100_is_a_Leap_Year() {
        assertTrue( Main.isLeapYear(8));
    }

    @Test
    @DisplayName("Test that year is dividable by 400")
    void If_year_is_dividable_by_400_is_a_Leap_Year() {
        assertTrue( Main.isLeapYear(2000));
    }

    @Test
    @DisplayName("Test that it is not dividable by 4 therefor not a leap year")
    void If_year_is_not_dividable_by_4_is_Not_a_Leap_Year() {
        assertFalse( Main.isLeapYear(1900));
    }
    @Test
    @DisplayName("Test that it is dividable by 100 but not 400 therefor not a leapyear")
    void If_year_is_dividable_by_100_but_not_400_is_Not_a_Leap_Year() {
        assertFalse( Main.isLeapYear(2100));
    }


}