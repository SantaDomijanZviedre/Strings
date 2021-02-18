package com.company;

public class StringAssign5 {

    public static void main(String[] args) {
//        String str = "Mom";
//        String str = "Was it a car or a cat I saw?";
        String str = "Madam, in Eden, I'm Adam.";
//        String str = "Yo, banana boy!";

        String strClean = convertToLettersOnly(str);

        System.out.println(str);
        if (isPalindrome(strClean))
            System.out.println("Yes, it is palindrome.");
        else
            System.out.println("No, it isn't palindrome.");
    }

    public static String convertToLettersOnly(String str) {

        str = str.toLowerCase(); // how to apply Pattern.CASE_INSENSITIVE here?
        String strClean = str.replaceAll("[^a-z]", "");

        return strClean;
    }

    public static boolean isPalindrome(String strClean) {

        int i = 0;
        int j = strClean.length() - 1;
        while (i < j) {
            if (strClean.charAt(i) != strClean.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
