package com.company;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringAssign5 {

    public static void main(String[] args) {

        String str = "Mom";
        String str1 = "Was it a car or a cat I saw?";
        String str2 = "Madam, in Eden, I'm Adam.";
        String str3 = "Yo, banana boy!";

        toLowerCase(str, str1, str2, str3);

        if(isPalindrome(str, str1, str2, str3))
            System.out.println("Yes, it is palindrome.");
        else
            System.out.println("No, it isn't palindrome.");
    }

    public static boolean isPalindrome(String str, String str1, String str2, String str3) {

        str = str.toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void toLowerCase(String str, String str1, String str2, String str3) {

        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();
    }
}
