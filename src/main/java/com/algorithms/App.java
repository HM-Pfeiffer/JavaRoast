package com.algorithms;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        // 2235. Add Two Integers Sum
        int num = 121;
        PalindromeNumber pal = new PalindromeNumber();
        boolean newPal = pal.isPalindrome(num);
        System.out.println("Is " + num + " a palindrome number: " + newPal);

        // 1929. Concatenation of Array
        int[] nums = {1,2,1};
        ConcatenationOfArray conArr = new ConcatenationOfArray();
        int[] res = conArr.getConcatenation(nums);
        System.out.println("result of concatenating " 
            + Arrays.toString(nums) + " with " 
            + Arrays.toString(nums)  + " is: " + Arrays.toString(res));
        
    }
}
