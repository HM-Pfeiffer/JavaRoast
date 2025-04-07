package com.algorithms;

import java.util.Arrays;
import java.util.Scanner; 

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int machineOn = 1; 
        
        while (machineOn == 1){
            System.out.println("\nEnter the name of the algorithm you want to run: PalindromeNumber, ConcatenationOfArray\n");
            String algo = scanner.nextLine();
            
            switch(algo){
                case "PalindromeNumber":
                    int num = 121;
                    PalindromeNumber pal = new PalindromeNumber();
                    boolean newPal = pal.isPalindrome(num);
                    System.out.println("\nIs " + num + " a palindrome number: " + newPal + "\n");
                    machineOn = 0;
                    break;

                case "ConcatenationOfArray":
                    int[] nums = {1,2,1};
                    ConcatenationOfArray conArr = new ConcatenationOfArray();
                    int[] res = conArr.getConcatenation(nums);
                    System.out.println("\nresult of concatenating " 
                        + Arrays.toString(nums) + " with " 
                        + Arrays.toString(nums)  + " is: " + Arrays.toString(res) + "\n");
                    machineOn = 0;
                    break;

                default:
                    System.out.println("\nAlgorithm not recognized. Please try again.\n");
                    break;
            }
        }   
        scanner.close();
    }
}
