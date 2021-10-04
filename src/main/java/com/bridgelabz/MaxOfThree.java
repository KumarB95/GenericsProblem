package com.bridgelabz;
import testOfMax.testCases;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        testCases testCases=new testCases();

        Integer[] intArray={15,12,13};
        Float[] floatArray={12.5f,25.35f,50.25f};
        String[] stringArray={"Apple","Peach","Banana"};
        Integer[] intArray1={10,12,25,58,54,48};

        System.out.println("Maximum of int [15,12,13] is : "+testCases.findMax(intArray));
        System.out.println("Maximum of Float [12.5f,25.35f,50.25f] is : "+testCases.findMax(floatArray));
        System.out.println("Maximum of String [\"Apple\",\"Peach\",\"Banana\"] is : "+testCases.findMax(stringArray));
        System.out.println("Maximum of More than three numbers {10,12,25,58,54,48} is : "+testCases.findMax(intArray1));
    }
}