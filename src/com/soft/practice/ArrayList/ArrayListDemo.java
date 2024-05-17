package com.soft.practice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.set(0, "Java");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
