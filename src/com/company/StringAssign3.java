package com.company;

public class StringAssign3 {

    public static void main(String[] args) {

        String name = "John";
        System.out.println(name.matches("[A-Za-z]{4}"));

        String username = "s20surname";
        System.out.println(username.matches("^[a-z][0-9]{2}[a-z]*"));

        String personCodeOfLatvian = "121200-11311";
        System.out.println(personCodeOfLatvian.matches("^[0-9]{6}[-][0-9]{5}"));
    }
}



// Initial code before optimisation:
/*    String name = "John";
        if (name.matches("[A-Za-z]{4}")) {
                System.out.println(true);
                } else
                System.out.println(false);*/

// for regex learning reference:
// System.out.println(username.matches("^[a-z]{1}[0-9]{2}[a-z]{0,}"));
// {1} can be excluded; {0,} can be replaced by *

