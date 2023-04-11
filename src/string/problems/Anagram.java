package string.problems;

import org.junit.Assert;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        // here is the two strings store in variables
        String firstString = "night";
        String secondString = "thing";

        char str1[] = firstString.toCharArray();
        char str2[] = secondString.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String s1 = new String(str1);
        String s2 = new String(str2);

        if (s1.equals(s2)) {
            System.out.println("Strings are anagram so test pass ");
        } else {
            System.out.println("Strings are not anagram so test failed");
        }


    }
}