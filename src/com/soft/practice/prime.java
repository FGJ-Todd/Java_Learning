package com.soft.practice;

public class prime {
    public static void prime(int a){
        for (int j = 0; j < a; j++) {
            boolean flag = true;
            for (int i = 2; i < a; i++) {
                if (j % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(j+"是一个素数");
        }

    }
}
