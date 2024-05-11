package com.soft.practice;

public class Vehicle {
    String brand;
    int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getInfo(){
        return "\t汽车品牌为:"+brand+"\t汽车年份为:"+year;
    }
}

