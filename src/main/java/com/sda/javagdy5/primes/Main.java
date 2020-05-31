package com.sda.javagdy5.primes;

public class Main {

    public static void main(String[] args) {

    }

    private static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
