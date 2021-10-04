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

        testCases.findMax(intArray);
        testCases.findMax(floatArray);
        testCases.findMax(stringArray);
        testCases.findMax(intArray1);
    }
}