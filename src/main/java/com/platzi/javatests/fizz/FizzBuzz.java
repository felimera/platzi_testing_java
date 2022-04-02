package com.platzi.javatests.fizz;

public class FizzBuzz {
    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";

    public static String fizzBuzz(int n) {
        String valor = "";
        if (n % 3 == 0)
            valor += FIZZ;
        if (n % 5 == 0)
            valor += BUZZ;
        return valor.trim().length() > 0 ? valor : Integer.toString(n);
    }
}
