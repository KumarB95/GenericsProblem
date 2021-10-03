package testOfMax;
import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testCases {
    public static void findMaxInThree(Integer[] intArray) {
        int max=0;
        for (int i=0;i< intArray.length;i++){
            if (intArray[i]>max){
                max=intArray[i];
            }
        }
        System.out.println("Max number is : "+max);
    }

    public void findMaxFloat(Float[] floatArray) {
        float max=0;
        for (int i=0;i< floatArray.length;i++){
            if (floatArray[i]>max){
                max=floatArray[i];
            }
        }
        System.out.println("Max number is : "+max);
    }
}
