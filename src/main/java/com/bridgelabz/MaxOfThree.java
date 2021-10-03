package com.bridgelabz;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        Integer c=sc.nextInt();

        findMaxInThree(a,b,c);
    }

    private static void findMaxInThree(Integer a, Integer b, Integer c) {
        int max=a;
        if (b.compareTo(a)>0){
            max=b;
        }
        if (c.compareTo(max)>0){
            max=c;
        }
        System.out.println("Maximum in Three is : "+max);
    }
}
