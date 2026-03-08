package main.java;

/**
 * The FizzRule class represents a rule used in the FizzBuzz application for determining
 * custom outputs based on divisibility of integers. Each rule is defined by a divisor
 * (key), a string output (value), and a weight to determine precedence among multiple
 * matching rules.
 *
 *
 * Comparable Implementation:
 * The comparison is performed based on the weight field. Lower weight values indicate higher precedence.
 *
 * Fields:
 * - key: The divisor used to determine if the rule applies to a given number.
 * - value: The string associated with the rule, to be printed if the rule applies.
 * - weight: The precedence of the rule when multiple rules are applicable.
 */
public record FizzRule(Integer key, String value, Integer weight) implements Comparable<FizzRule> {

    /**
     * Compares this {@code FizzRule} object to another {@code FizzRule} object
     * to determine their relative ordering based on their weight.
     *
     * A {@code FizzRule} with a lower weight value is considered to have a higher precedence.
     *
     * @param o The {@code FizzRule} object to compare to this rule.
     * @return A negative integer if this rule has a lower weight than the specified rule,
     *         zero if the weights are equal, or a positive integer if this rule has a higher weight.
     */
    @Override
    public int compareTo(FizzRule o) {
        return this.weight.compareTo(o.weight());
    }
}
