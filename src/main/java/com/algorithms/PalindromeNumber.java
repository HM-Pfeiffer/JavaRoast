package com.algorithms;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // check if x is below 0, if negative return false
        if (x < 0) return false;
        // compare input string and string x in reverse 
        String str = String.valueOf(x);
        StringBuilder reverseString = new StringBuilder(str).reverse();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseString);

        return str.equals(reverseString.toString());
    }
}
