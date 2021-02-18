package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAssign1 {

    public static void main(String[] args) {

        String[] arr = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};

        System.out.println(Arrays.toString(arr));

        System.out.println("\nThere are " + startingC(arr) + " words starting with 'C'.\n");
        endingE(arr);
        System.out.println("\nThere are " + length5(arr) + " words 5 characters long. \n");
        System.out.println("There are " + howManyValuesWithE(arr) + " words containing character 'e'.\n");

        System.out.println("These " + subStringTe(arr) + " words contain substring 'te'.\n");

        System.out.println("Histogram of words related to their length: ");
        histogram(arr);
    }

    public static int startingC(String[] arr) {

        int counter = 0;
        for (String value : arr) {
            if (value.startsWith("C")) {
                counter++;
            }
        }
        return counter;
    }

    public static void endingE(String[] arr) {

        int counter = 0;
        for (String value : arr) {
            if (value.endsWith("e")) {
                counter++;
                if (counter < 2) {
                    System.out.println("There is " + counter + " word ending with 'e'.");
                } else {
                    System.out.println("There are " + counter + " words ending with 'e'.");
                }
            }
        }
    }

    public static int length5(String[] arr) {

        int counter = 0;
        for (String value : arr) {
            if (value.length() == 5) {
                counter++;
            }
        }
        return counter;
    }

    public static int howManyValuesWithE(String[] arr) {

        int counter = 0;
        for (String value : arr) {
            if (value.contains("e")) {
                counter++;
            }
        }
        return counter;
    }

    public static int subStringTe(String[] arr) {

        int counter = 0;
        for (String value : arr) {

            Pattern p = Pattern.compile("\\s*te\\s*");
            Matcher m = p.matcher(value);

            if (m.find()) {
                System.out.println(value);
                counter++;
            }
        }
        return counter;
    }

    public static void histogram(String[] arr) {

        int[] lengthOfWords = new int[14];

        for (int i = 0; i < lengthOfWords.length; i++) {
            int counter = 0;
            for (String str : arr) {
                if (i == str.length()) {
                    counter++;
                }
            }
            lengthOfWords[i] = counter;
            if (counter != 0 && counter < 2) {
                System.out.println("There is 1 word that consists of " + i + " letters.");
            } if (counter > 1) {
                    System.out.println("There are " + lengthOfWords[i] + " words that consist of " + i + " letters.");
            }
        }
    }
}