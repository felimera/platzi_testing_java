package com.platzi.javatests.roman;

import java.util.HashMap;

public class RomanNumerals {
    private static HashMap<Integer, String> numberToOneToTen = new HashMap<>();

    public static void loadToOneToTen() {
        numberToOneToTen.put(0, "");
        numberToOneToTen.put(1, "I");
        numberToOneToTen.put(2, "II");
        numberToOneToTen.put(3, "III");
        numberToOneToTen.put(4, "IV");
        numberToOneToTen.put(5, "V");
        numberToOneToTen.put(6, "VI");
        numberToOneToTen.put(7, "VII");
        numberToOneToTen.put(8, "VII");
        numberToOneToTen.put(9, "IX");
    }

    public static String arabicToRoman(String number) {
        StringBuilder result = new StringBuilder();
        for (int i = number.length() - 1, aux = 0; i >= 0; i--, aux++) {
            int n = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (aux == 0) {
                result.append(String.format("%s", numberToOneToTen.get(n)));
            } else if (aux == 1) {
                String value = result.toString();
                result.setLength(0);
                result.append(String.format("%s%s", getDecimals(n), value));
            } else if (aux == 2) {
                String value = result.toString();
                result.setLength(0);
                result.append(String.format("%s%s", getHundreds(n), value));
            } else if (aux == 3) {
                String value = result.toString();
                result.setLength(0);
                result.append(String.format("%s%s", getThousand(n), value));
            }
        }
        return result.toString();
    }

    public static String getThousand(int number) {
        StringBuilder result = new StringBuilder();
        switch (number) {
            case 0:
                result.append("");
                break;
            case 1:
                result.append("M");
                break;
            case 2:
                result.append("MM");
                break;
            default:
                break;

        }
        return result.toString();
    }

    public static String getHundreds(int number) {
        StringBuilder result = new StringBuilder();
        switch (number) {
            case 0:
                result.append("");
                break;
            case 1:
                result.append("C");
                break;
            case 4:
                result.append("CD");
                break;
            case 5:
                result.append("D");
                break;
            case 9:
                result.append("CM");
                break;
            default:
                break;
        }
        return result.toString();
    }

    public static String getDecimals(int number) {
        StringBuilder result = new StringBuilder();
        switch (number) {
            case 0:
                result.append("");
                break;
            case 1:
                result.append("X");
                break;
            case 2:
                result.append("XX");
                break;
            case 3:
                result.append("XXX");
                break;
            case 4:
                result.append("XL");
                break;
            case 5:
                result.append("L");
                break;
            case 6:
                result.append("LX");
                break;
            case 7:
                result.append("LXX");
                break;
            case 8:
                result.append("LXXX");
                break;
            case 9:
                result.append("XC");
                break;
            default:
                break;
        }
        return result.toString();
    }
}
