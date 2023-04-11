package math.problems;

import org.junit.Assert;

public class Factorial {

    public Factorial(int i) {
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial =factorial* i;
        }
        System.out.printf(String.valueOf(factorial));


}


}


