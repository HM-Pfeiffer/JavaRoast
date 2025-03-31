package com.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ConcatenationOfArrayTest {

    @Test
    public void testGetConcatenation() {
        ConcatenationOfArray conArr = new ConcatenationOfArray();

        // Test with a simple array
        int[] nums = {1, 2, 1};
        int[] expected = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(expected, conArr.getConcatenation(nums));

        // Test with an empty array
        int[] emptyNums = {};
        int[] expectedEmpty = {};
        assertArrayEquals(expectedEmpty, conArr.getConcatenation(emptyNums));

        // Test with a single-element array
        int[] singleNums = {5};
        int[] expectedSingle = {5, 5};
        assertArrayEquals(expectedSingle, conArr.getConcatenation(singleNums));
    }
}