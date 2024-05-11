package com.soft.practice;

import java.lang.reflect.Array;

public class ArrayUtil {

    public ArrayUtil(){}

    public static String printArr(int [] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }

    public static double getAerage(int [] arr1){
        int sum = 0;
        for (int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }
        return (double) sum /arr1.length;
    }
}
