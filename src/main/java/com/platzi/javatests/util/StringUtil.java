package com.platzi.javatests.util;

import java.util.Objects;

public class StringUtil {
    public static String repeat(String str, int times) {
        if (times < 0)
            throw new IllegalArgumentException("negative times not allowed");
        StringBuilder resulta = new StringBuilder();
        for (int i = 0; i < times; i++) {
            resulta.append(str);
        }
        return resulta.toString();
    }

    public static boolean isEmpty(String str) {
        return Objects.isNull(str) || str.trim().isEmpty();
    }
}
