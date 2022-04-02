package com.platzi.javatests.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    @Before
    public void set() {
        RomanNumerals.loadToOneToTen();
    }

    @Test
    public void valid_number_1_to_roman() {
        assertEquals("I", RomanNumerals.arabicToRoman("1"));
    }

    @Test
    public void valid_number_2_to_roman() {
        assertEquals("II", RomanNumerals.arabicToRoman("2"));
    }

    @Test
    public void valid_number_3_to_roman() {
        assertEquals("III", RomanNumerals.arabicToRoman("3"));
    }

    @Test
    public void valid_number_5_to_roman() {
        assertEquals("V", RomanNumerals.arabicToRoman("5"));
    }

    @Test
    public void valid_number_6_to_roman() {
        assertEquals("VI", RomanNumerals.arabicToRoman("6"));
    }

    @Test
    public void valid_number_7_to_roman() {
        assertEquals("VII", RomanNumerals.arabicToRoman("7"));
    }

    @Test
    public void valid_number_10_to_roman() {
        assertEquals("X", RomanNumerals.arabicToRoman("10"));
    }

    @Test
    public void valid_number_11_to_roman() {
        assertEquals("XI", RomanNumerals.arabicToRoman("11"));
    }

    @Test
    public void valid_number_15_to_roman() {
        assertEquals("XV", RomanNumerals.arabicToRoman("15"));
    }

    @Test
    public void valid_number_16_to_roman() {
        assertEquals("XVI", RomanNumerals.arabicToRoman("16"));
    }

    @Test
    public void valid_number_50_to_roman() {
        assertEquals("L", RomanNumerals.arabicToRoman("50"));
    }

    @Test
    public void valid_number_51_to_roman() {
        assertEquals("LI", RomanNumerals.arabicToRoman("51"));
    }

    @Test
    public void valid_number_55_to_roman() {
        assertEquals("LV", RomanNumerals.arabicToRoman("55"));
    }

    @Test
    public void valid_number_56_to_roman() {
        assertEquals("LVI", RomanNumerals.arabicToRoman("56"));
    }

    @Test
    public void valid_number_60_to_roman() {
        assertEquals("LX", RomanNumerals.arabicToRoman("60"));
    }

    @Test
    public void valid_number_70_to_roman() {
        assertEquals("LXX", RomanNumerals.arabicToRoman("70"));
    }

    @Test
    public void valid_number_80_to_roman() {
        assertEquals("LXXX", RomanNumerals.arabicToRoman("80"));
    }

    @Test
    public void valid_number_81_to_roman() {
        assertEquals("LXXXI", RomanNumerals.arabicToRoman("81"));
    }

    @Test
    public void valid_number_85_to_roman() {
        assertEquals("LXXXV", RomanNumerals.arabicToRoman("85"));
    }

    @Test
    public void valid_number_86_to_roman() {
        assertEquals("LXXXVI", RomanNumerals.arabicToRoman("86"));
    }

    @Test
    public void valid_number_126_to_roman() {
        assertEquals("CXXVI", RomanNumerals.arabicToRoman("126"));
    }

    @Test
    public void valid_number_2507_to_roman() {
        assertEquals("MMDVII", RomanNumerals.arabicToRoman("2507"));
    }

    @Test
    public void valid_number_4_to_roman() {
        assertEquals("IV", RomanNumerals.arabicToRoman("4"));
    }

    @Test
    public void valid_number_9_to_roman() {
        assertEquals("IX", RomanNumerals.arabicToRoman("9"));
    }

    @Test
    public void valid_number_14_to_roman() {
        assertEquals("XIV", RomanNumerals.arabicToRoman("14"));
    }

    @Test
    public void valid_number_19_to_roman() {
        assertEquals("XIX", RomanNumerals.arabicToRoman("19"));
    }

    @Test
    public void valid_number_24_to_roman() {
        assertEquals("XXIV", RomanNumerals.arabicToRoman("24"));
    }

    @Test
    public void valid_number_40_to_roman() {
        assertEquals("XL", RomanNumerals.arabicToRoman("40"));
    }

    @Test
    public void valid_number_49_to_roman() {
        assertEquals("XLIX", RomanNumerals.arabicToRoman("49"));
    }

    @Test
    public void valid_number_90_to_roman() {
        assertEquals("XC", RomanNumerals.arabicToRoman("90"));
    }

    @Test
    public void valid_number_99_to_roman() {
        assertEquals("XCIX", RomanNumerals.arabicToRoman("99"));
    }

    @Test
    public void valid_number_400_to_roman() {
        assertEquals("CD", RomanNumerals.arabicToRoman("400"));
    }

    @Test
    public void valid_number_900_to_roman() {
        assertEquals("CM", RomanNumerals.arabicToRoman("900"));
    }
}