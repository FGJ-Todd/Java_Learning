package com.soft.practice;

public class OptimizePrimeNumbers {
    /**
     * 对判断质数的一个算法优化
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 2 == 0) return false;
        }
        return false;
    }
}
