package it.mario.tdd.fizzbuzzkata;

/**
 * Created by mario on 10/07/14.
 */
public class FizzBuzzGame {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public static String play(int number) {
        StringBuilder result = new StringBuilder("");

        applyFizzRule(number, result);
        applyBuzzRule(number, result);
        applyNormalRule(number, result);

        return result.toString();
    }

    private static void applyNormalRule(int number, StringBuilder result) {
        if (result.length() == 0)
            result.append(String.valueOf(number));
    }

    private static void applyBuzzRule(int number, StringBuilder result) {
        if (isDivisibleBy5(number))
            result.append(BUZZ);
    }

    private static void applyFizzRule(int number, StringBuilder result) {
        if (isDivisibleBy3(number))
            result.append(FIZZ);
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
