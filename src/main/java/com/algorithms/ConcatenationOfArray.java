package com.algorithms;

public class ConcatenationOfArray {
    public int[] concatenateArray(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] newArray = new int[len1 + len2];
        int maxLen = len1 > len2 ? len1 : len2;

        for(int i = 0; i < maxLen; i++){
            if(i < len1) newArray[i] = arr1[i];   
            if(i < len2) newArray[i + len1] = arr2[i];
        }
        return newArray;
    }

    public int[] getConcatenation(int[] nums) {
        int[] ans = concatenateArray(nums, nums);
        return ans;
    }
}
