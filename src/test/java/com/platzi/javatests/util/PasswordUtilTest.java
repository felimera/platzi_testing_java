package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void mediun_when_has_letters_and_numbers() {
        assertEquals(MEDIUN, PasswordUtil.assessPassword("abcd123456"));
    }

    @Test
    public void strong_when_has_letters_numbers_sumbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123456!"));
    }
}