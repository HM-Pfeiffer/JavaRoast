package com.algorithms;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {
        PalindromeNumber pal = new PalindromeNumber();

        // Test a palindrome number
        assertTrue(pal.isPalindrome(121));

        // Test a non-palindrome number
        assertFalse(pal.isPalindrome(123));
    }
}