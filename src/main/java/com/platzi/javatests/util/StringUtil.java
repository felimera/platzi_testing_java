package com.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int times) {
        if (times < 0)
            throw new IllegalArgumentException("negative times not allowed");
        String resulta = "";
        for (int i = 0; i < times; i++) {
            resulta += str;
        }
        return resulta;
    }
}
