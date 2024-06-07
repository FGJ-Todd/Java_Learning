package com.soft.practice.stream;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaStudy {
    public static void main(String[] args) {
        Integer[] a = {2, 4, 6, 3, 1, 7, 8, 9, 5, 0};
        String[] b = {"a", "aaaaa", "aaa", "aa", "aaaa"};
        Arrays.sort(b, (o1, o2) -> o2.length() - o1.length());
        method(() -> {
            System.out.println("正在游泳");
        });
        System.out.println(Arrays.toString(b));


    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}