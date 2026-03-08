package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15);
    }

    /*
     * The Classic 'FizzBuzz' problem
     *
     * For a given integer n, a line i, starting at 1 will be printed based on the following conditions:
     * FizzBuzz if i is divisible by 3 and 5
     * Fizz if only divisible by 3
     * Buzz if only divisible by 5
     * i if not divisible by 3 or 5
     *
     * @input n The total number of lines printed
     */
    public static void fizzBuzz(int n) {
        FizzRulePair[] defaultRules = {new FizzRulePair(3, "Fizz", 1),
                new FizzRulePair(5, "Buzz", 2)};
        fizzBuzzPrinter(defaultRules, n);
    }
    /*
     * Helper method for fizz buzz, handles logic
     */
    private static void fizzBuzzPrinter(FizzRulePair[] rules, int n) {
        for (int i = 1; i <= n; i++) {
            ArrayList<FizzRulePair> matchingRules = new ArrayList<>();
            for (FizzRulePair rule : rules) {
                if (i % rule.key() == 0) {
                    matchingRules.add(rule);
                }
            }

            if (matchingRules.isEmpty()) {
                System.out.println(i);
            } else {
                Collections.sort(matchingRules);
                StringBuilder output = new StringBuilder();
                for (FizzRulePair rule : matchingRules) {
                    output.append(rule.value());
                }
                System.out.println(output);
            }
        }
    }
}
