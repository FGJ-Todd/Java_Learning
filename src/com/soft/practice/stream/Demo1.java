package com.soft.practice.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张飞","李四","张宝","张角","张三丰");
//        list.add("张飞");
//        list.add("李四");
//        list.add("张宝");
//        list.add("张角");
//        list.add("张三丰");

        Stream<String> stream1 = list.stream();
//        stream1.forEach();
    }
}
