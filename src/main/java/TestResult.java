package main.java;

public record TestResult(String testName, boolean didPass, String expected, String actual) {}
