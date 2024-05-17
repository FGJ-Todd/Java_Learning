package com.soft.practice.lekou;

public class EatOranges {
    public static int eatOranges(int n){
        int count=0;
        while (n>0){
            if (n%3==0){
                n=n-2*(n/3);
            }else if (n%2==0) {
                n=n/2;
            }else {
                n--;
            }
            count++;
            System.out.println(count);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(eatOranges(10));
    }
}
