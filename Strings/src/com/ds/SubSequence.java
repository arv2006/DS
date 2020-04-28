package com.ds;

public class SubSequence {

    public static void main(String[] args) {

        String s1 = "today is monday";
        String s2 = "timn";

        int len1 = s1.length();
        int len2 = s2.length();

        int j = 0;

        for (int i = 0; i < len1 && j < len2; i++) {
            if (s2.charAt(j) == s1.charAt(i))
                j++;
        }
        if (j == len2)
            System.out.println("String found");
        else
            System.out.println("String not found");
    }
}
