package com.soft.practice.heima;

public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String eat(String foot){
        return "吃"+foot;
    }
    interface swin {}
}
