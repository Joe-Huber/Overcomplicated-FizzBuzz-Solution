package main.java;

public record FizzRulePair(Integer key, String value, Integer weight) implements Comparable<FizzRulePair> {
    @Override
    public int compareTo(FizzRulePair o) {
        return this.weight.compareTo(o.weight());
    }
}
