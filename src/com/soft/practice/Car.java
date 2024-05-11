package com.soft.practice;

public class Car extends Vehicle{
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, int year, String color) {
        super(brand, year);
        this.color = color;
    }

    public String getInfo(){
        return "\t汽车品牌为:"+super.brand+"\t汽车年份为:"+super.year+"\t汽车颜色为:"+this.color;
    }

    public static void main(String[] args) {
        Car c = new Car("大众", 2004, "red");
        System.out.println(c.getInfo());
    }
}
