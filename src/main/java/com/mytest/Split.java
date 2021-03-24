package com.mytest;

import java.util.Arrays;

public class Split {
    public static void main(String [] srgs){
        String str="192.168.1.1";
        String [] array=str.split("\\.");
        System.out.println(Arrays.toString(array));
        String [] array1=str.split("\\.",2);
        System.out.println(Arrays.toString(array1));

    }
}
