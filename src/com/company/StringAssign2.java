package com.company;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAssign2 {

    public static void main(String[] args) {

        String str = "Climb mountains not so the world can see you, but so you can see the world";

        System.out.println("There are " + wordsInSentence(str) + " words in this sentence.");
        System.out.println("There are " + the(str) + " words 'the' in this sentence.");
        System.out.println("There are " + letterS(str) + " words containing letter 's' in this sentence.");
        repetitiveWords(str);
        capitaliseYou(str);
        System.out.println("These words are repeated multiple times: "
                + String.join(", ", multipleTimes(str)));
    }

    public static long countByPattern(String str, String pattern) {

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        return m.results().count();
    }

    public static long wordsInSentence(String str) {

        return countByPattern(str, "\\S+");

        // Code sample before making countByPattern Method:
        //Pattern p = Pattern.compile("\\S+");
        //Matcher m = p.matcher(str);
        //    return m.results().count();
    }

    public static long the(String str) {

        return countByPattern(str, "\\bthe\\b");
    }

    public static long letterS(String str) {

        return countByPattern(str, "\\S*s\\S*");
    }

    public static void repetitiveWords(String str) {

        int counter;
        str = str.toLowerCase();
        String[] split = str.split(" ");
        System.out.println("These words are repeated multiple times: ");
        for(int i = 0; i < split.length; i++) {
            counter = 1;
            for(int j = i+1; j < split.length; j++) {
                if(split[i].equals(split[j])) {
                    counter++;
                    split[j] = "0";
                }
            }
            if(counter > 1 && !split[i].equals("0"))
                System.out.println(split[i]);
        }
    }

    public static void capitaliseYou(String str) {

        System.out.println(str.replaceAll("\\byou\\b", "You"));
    }


    // 'Smart' way of finding REPEATING words:
    public static String[] multipleTimes(String str) {

        Pattern p = Pattern.compile("(\\b\\S+\\b)(?=.+\\1)");
        Matcher m = p.matcher(str);

        Object[] array = m.results().toArray();
        String[] arr = new String[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((MatchResult) array[i]).group();
        }

       return arr;
    }
}

// Handy piece of code for SPLITTING STRING TO WORDS:
/*    public static String[] splitString(String str) {

        String[] split = str.split(" ");
        return split;
    }*/
