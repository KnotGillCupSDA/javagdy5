package com.sda.javagdy5.factorial;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Factorial factorial1 = new FactorialIterative();
        Factorial factorial2 = new FactorialRecursive();

        Instant start = Instant.now();
        factorial1.calculate(5432);
        System.out.println("Czas dla podejścia itercyjnego: "+ Duration.between(start, Instant.now()));

        start = Instant.now();
        factorial2.calculate(5432);
        System.out.println("Czas dla podejścia rekurencyjnego: "+ Duration.between(start, Instant.now()));

    }
}
