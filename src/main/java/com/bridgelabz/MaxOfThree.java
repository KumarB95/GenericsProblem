package com.bridgelabz;
import testOfMax.testCases;

public class MaxOfThree {
    public static void main(String[] args) {
        testCases testCases=new testCases();
        Integer[] intArray={15,12,13};
        Float[] floatArray={12.5f,25.35f,50.25f};
        String[] stringArray={"Apple","Peach","Banana"};

        testCases.findMaxInThree(intArray);
        testCases.findMaxFloat(floatArray);
        testCases.findMaxString(stringArray);
    }
}
