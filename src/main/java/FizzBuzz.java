package main.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class implementing the classic FizzBuzz problem with extended flexibility
 * to define custom rules for determining output based on divisibility.
 *
 * FizzBuzz is a programming exercise where numbers are printed in order from 1 
 * to a given integer n. For each number:
 * - Print "FizzBuzz" if the number is divisible by both 3 and 5.
 * - Print "Fizz" if the number is divisible only by 3.
 * - Print "Buzz" if the number is divisible only by 5.
 * - Print the number itself if it is not divisible by 3 or 5.
 *
 * This implementation enables extensions with custom "Fizz" rules using the
 * {@link FizzRule} class.
 * 
 * @Author Joe Huber
 * @Date March 8, 2026
 * @Version 4.0
 */
public class FizzBuzz {

    /**
     * The entry point of the application, demonstrating the execution of the FizzBuzz logic.
     *
     * @param args Command-line arguments passed to the program. These are not used in this implementation.
     */
    public static void main(String[] args) {
        fizzBuzz(2);
    }

    /**
     * Executes the FizzBuzz logic for the given range from 1 to n.
     * For each integer in this range:
     * - Prints "Fizz" for numbers divisible by 3.
     * - Prints "Buzz" for numbers divisible by 5.
     * - Prints "FizzBuzz" for numbers divisible by both 3 and 5.
     * - Prints the number itself if it does not satisfy any of the above rules.
     *
     * @param n The upper limit of the range (inclusive) for which FizzBuzz logic is applied. 
     *          Must be a positive integer.
     */
    public static void fizzBuzz(int n) {
        FizzRule[] defaultRules = {new FizzRule(3, "Fizz", 1),
                new FizzRule(5, "Buzz", 2)};
        fizzBuzzPrinter(defaultRules, n);
    }

    /**
     * Prints numbers from 1 to n, replacing certain numbers with string values based on provided rules.
     * For each number:
     * - If the number is divisible by the key of one or more rules, the corresponding rule values are concatenated and printed.
     * - If no rules match the number, the number itself is printed.
     *
     * @param rules An array of {@link FizzRule} objects, where each pair defines:
     *              - A key (divisor) to determine which numbers the rule applies to.
     *              - A value (string) to print when the rule matches.
     *              - A weight to resolve ordering when multiple rules match.
     * @param n     The upper limit of the range (inclusive). Specifies the maximum number to iterate through from 1.
     */
    private static void fizzBuzzPrinter(FizzRule[] rules, int n) {
        for (int i = 1; i <= n; i++) {
            ArrayList<FizzRule> matchingRules = new ArrayList<>();
            for (FizzRule rule : rules) {
                if (i % rule.key() == 0) {
                    matchingRules.add(rule);
                }
            }

            if (matchingRules.isEmpty()) {
                System.out.println(i);
            } else {
                Collections.sort(matchingRules);
                StringBuilder output = new StringBuilder();
                for (FizzRule rule : matchingRules) {
                    output.append(rule.value());
                }
                System.out.println(output);
            }
        }
    }
}
