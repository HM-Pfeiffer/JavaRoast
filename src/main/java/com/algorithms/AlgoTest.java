package com.algorithms;

import java.util.List;
import java.util.ArrayList;

public class AlgoTest{

    private int number;
    private String strThing;
    private List<Integer> myList = new ArrayList<>();
    
    public void addToAList(int x, int y){
        this.myList.add(x);
        this.myList.add(y);
    }

    public void getMyList(){
        System.out.println("Printing from myList getter");
        for(int num : myList){
            System.out.println("The Number is " + num);
        }
    }

}