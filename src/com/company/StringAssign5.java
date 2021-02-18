package com.company;

public class StringAssign5 {

    public static void main(String[] args) {
//        String str = "Mom";
//        String str = "Was it a car or a cat I saw?";
        String str = "Madam, in Eden, I'm Adam.";
//        String str = "Yo, banana boy!";

        String strLettersOnly = convertToLettersOnly(str);

        System.out.println(str);
        if (isPalindrome(strLettersOnly))
            System.out.println("Yes, it is palindrome.");
        else
            System.out.println("No, it isn't palindrome.");
    }

    public static String convertToLettersOnly(String str) {

        str = str.toLowerCase(); // how to apply Pattern.CASE_INSENSITIVE here?
        String strLettersOnly = str.replaceAll("[^a-z]", "");

        return strLettersOnly;
    }

    public static boolean isPalindrome(String strLettersOnly) {

        int i = 0;
        int j = strLettersOnly.length() - 1;
        while (i < j) {
            if (strLettersOnly.charAt(i) != strLettersOnly.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
