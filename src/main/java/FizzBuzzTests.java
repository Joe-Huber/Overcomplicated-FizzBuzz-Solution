package main.java;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * The FizzBuzzTests class contains test cases for validating the functionality of a FizzBuzz implementation.
 * It performs automated tests to ensure correct behavior for a variety of boundary and edge cases.
 * The framework uses the standard output stream to capture and verify the results of the FizzBuzz logic.
 *
 * @Author Joe Huber
 * @Date March 10, 2026
 * @Version 5.0
 */
public class FizzBuzzTests {
    public static void main(String[] args) {
        // Create a stream to hold the console output
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        // Save old System.out
        PrintStream old = System.out;

        standardRuleTests(ps, old, byteArrayOutputStream);
    }

    /**
     * Executes a series of predefined standard rule tests for the FizzBuzz implementation.
     *
     * @param ps The PrintStream to redirect and capture output during test execution.
     * @param old The original PrintStream to restore output after test completion.
     * @param byteArrayOutputStream The ByteArrayOutputStream used to capture the test output for verification.
     */
    private static void standardRuleTests(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream){
        //Test 1 - Base 0 case
        TestChecker(baseZeroCase(ps, old, byteArrayOutputStream));

        //Test 2 - Base 1 case
        TestChecker(baseOneCase(ps, old, byteArrayOutputStream));

        //Test 3 - Base 2 case
        TestChecker(baseTwoCase(ps, old, byteArrayOutputStream));

        //Test 4 - Base 5 case
        TestChecker(baseFiveCase(ps, old, byteArrayOutputStream));

        //Test 5 - Base 15 case
        TestChecker(baseFifteenCase(ps, old, byteArrayOutputStream));

        //Test 6 - Base 30 case
        TestChecker(baseThirtyCase(ps, old, byteArrayOutputStream));

        //Test 7 - Base 100 case
        TestChecker(baseOneHundredCase(ps, old, byteArrayOutputStream));

        //Test 8 - Base -1 case
        TestChecker(baseNegativeOneCase(ps, old, byteArrayOutputStream));

        //Test 9 - Base -100 case
        TestChecker(baseNegativeOneHunderedCase(ps, old, byteArrayOutputStream));

        //Test 10 - Base -5 case
        TestChecker(baseNegativeFiveCase(ps, old, byteArrayOutputStream));

        //Test 11 - Base 256 case
        TestChecker(baseTwoHunderedFiftySix(ps, old, byteArrayOutputStream));
    }

    private static void customRuleTests(){

    }

    private static TestResult baseZeroCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream){
        String testName = "Test 1 - Base 0 case";
        String expectedOutput = "";
        int input = 0;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseOneCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream){
        String testName = "Test 2 - Base 1 case";
        String expectedOutput = "1\n";
        int input = 1;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseTwoCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream){
        String testName = "Test 3 - Base 2 case";
        String expectedOutput = "1\n2\n";
        int input = 2;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseFiveCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 4 - Base 5 case";
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\n";
        int input = 5;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseFifteenCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 5 - Base 15 case";
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        int input = 15;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseThirtyCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 6 - Base 30 case";
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz" +
                "\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n";
        int input = 30;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseOneHundredCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 7 - Base 100 case";
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz" +
                "\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz" +
                "\n31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n41\nFizz\n43\n44\nFizzBuzz" +
                "\n46\n47\nFizz\n49\nBuzz\nFizz\n52\n53\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz" +
                "\n61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n71\nFizz\n73\n74\nFizzBuzz" +
                "\n76\n77\nFizz\n79\nBuzz\nFizz\n82\n83\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz" +
                "\n91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz\n";
        int input = 100;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseNegativeOneCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 8 - Base -1 case";
        String expectedOutput = "";
        int input = -1;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseNegativeOneHunderedCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 9 - Base -100 case";
        String expectedOutput = "";
        int input = -100;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseNegativeFiveCase(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 10 - Base -5 case";
        String expectedOutput = "";
        int input = -5;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult baseTwoHunderedFiftySix(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream) {
        String testName = "Test 11 - Base 256 case";
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz" +
                "\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz" +
                "\n31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n41\nFizz\n43\n44\nFizzBuzz" +
                "\n46\n47\nFizz\n49\nBuzz\nFizz\n52\n53\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz" +
                "\n61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n71\nFizz\n73\n74\nFizzBuzz" +
                "\n76\n77\nFizz\n79\nBuzz\nFizz\n82\n83\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz" +
                "\n91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz\n101\nFizz\n103\n104\nFizzBuzz\n" +
                "106\n107\nFizz\n109\nBuzz\nFizz\n112\n113\nFizz\nBuzz\n116\nFizz\n118\n119\nFizzBuzz\n" +
                "121\n122\nFizz\n124\nBuzz\nFizz\n127\n128\nFizz\nBuzz\n131\nFizz\n133\n134\nFizzBuzz\n" +
                "136\n137\nFizz\n139\nBuzz\nFizz\n142\n143\nFizz\nBuzz\n146\nFizz\n148\n149\nFizzBuzz\n" +
                "151\n152\nFizz\n154\nBuzz\nFizz\n157\n158\nFizz\nBuzz\n161\nFizz\n163\n164\nFizzBuzz\n" +
                "166\n167\nFizz\n169\nBuzz\nFizz\n172\n173\nFizz\nBuzz\n176\nFizz\n178\n179\nFizzBuzz\n" +
                "181\n182\nFizz\n184\nBuzz\nFizz\n187\n188\nFizz\nBuzz\n191\nFizz\n193\n194\nFizzBuzz\n" +
                "196\n197\nFizz\n199\nBuzz\nFizz\n202\n203\nFizz\nBuzz\n206\nFizz\n208\n209\nFizzBuzz\n" +
                "211\n212\nFizz\n214\nBuzz\nFizz\n217\n218\nFizz\nBuzz\n221\nFizz\n223\n224\nFizzBuzz\n" +
                "226\n227\nFizz\n229\nBuzz\nFizz\n232\n233\nFizz\nBuzz\n236\nFizz\n238\n239\nFizzBuzz\n" +
                "241\n242\nFizz\n244\nBuzz\nFizz\n247\n248\nFizz\nBuzz\n251\nFizz\n253\n254\nFizzBuzz\n" +
                "256\n";
        int input = 256;
        return standardTester(ps, old, byteArrayOutputStream, testName, input, expectedOutput);
    }

    private static TestResult standardTester(PrintStream ps, PrintStream old, ByteArrayOutputStream byteArrayOutputStream, String testName, int input, String expectedOutput) {
        TestResult result;

        System.setOut(ps);
        byteArrayOutputStream.reset();

        FizzBuzz.fizzBuzz(input);
        String output = byteArrayOutputStream.toString();

        if (!output.equals(expectedOutput)) {
            result = new TestResult(testName, false, expectedOutput, output);
        } else {
            result = new TestResult(testName, true, expectedOutput, output);
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        return result;
    }

    private static void TestChecker(TestResult result) {
        if (!result.didPass()) {
            System.out.println("Test " + result.testName() + " failed.");
            System.out.println("Expected Result:\n" + result.expected() +
                    "\nActual Result:\n" + result.actual() + "\n");
            throw new RuntimeException("Test " + result.testName() + " failed.");
        } else {
            System.out.println("Test " + result.testName() + " passed.");
        }
    }
}
