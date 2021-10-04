package testOfMax;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class testCases <E extends Comparable<E>>{
    Scanner sc=new Scanner(System.in);
    private E[] inputArray;

    public void Maximum(E[] inputArray) {
        this.inputArray=inputArray;
    }

    public static <E extends Comparable> void findMax(E[] inputArray){
        E max=inputArray[0];
        for (int i=1;i<inputArray.length;i++){
            if (inputArray[i].compareTo(max)>0){
                max=inputArray[i];
            }
        }
        printMax(max);
    }
    private static<T> void printMax(T max) {
        System.out.println("Maximum is : "+max);
    }
}