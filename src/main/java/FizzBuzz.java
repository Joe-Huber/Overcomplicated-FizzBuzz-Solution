package main.java;

import java.util.HashMap;
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
        FizzRulePair[] defaultRules = {new FizzRulePair(3, "Fizz"), new FizzRulePair(5, "Buzz")};
        fizzBuzzPrinter(defaultRules, n);
    }
    /*
     * Helper method for fizz buzz, handles logic
     */
    private static void fizzBuzzPrinter(FizzRulePair[] rules, int n) {
        //Init structure
        StringBuilder output = new StringBuilder();
        HashMap<Integer, String> printRules = new HashMap<>();

        //Fill in keys
        int[] keys = new int[rules.length];
        for(int i = 0; i < rules.length; i++) {
            keys[i] = rules[i].key();
            printRules.put(rules[i].key(), rules[i].value());
        }

        for (int i = 1; i <= n; i++) {
            for(int key: keys){
                if(i % key == 0) {output.append(printRules.get(key));}
            }

            if(output.isEmpty()){System.out.println(i);}
            else {System.out.println(output);}

            output = new StringBuilder();
        }
    }
}