package com.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int times) {
        String resulta = "";
        for (int i = 0; i < times; i++) {
            resulta += str;
        }
        return resulta;
    }
}
