package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_one() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("Hola", -1);
    }

    @Test
    public void any_string_is_not_empty() {
        Assert.assertFalse(StringUtil.isEmpty("Andres"));
    }

    @Test
    public void is_an_empty_string() {
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_also_an_empty_string() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_with_spaces_consider_as_empty() {
        Assert.assertTrue(StringUtil.isEmpty("    "));
    }
}