package testOfMax;

import static org.junit.Assert.assertEquals;


public class testCases <E extends Comparable<E>>{
    private E[] inputArray;

    public void Maximum(E[] inputArray) {
        this.inputArray=inputArray;
    }
    public static <E extends Comparable> E findMax(E[] inputArray){
        E max=inputArray[0];
        for (int i=1;i<inputArray.length;i++){
            if (inputArray[i].compareTo(max)>0){
                max=inputArray[i];
            }
        }
        return max;
    }
}