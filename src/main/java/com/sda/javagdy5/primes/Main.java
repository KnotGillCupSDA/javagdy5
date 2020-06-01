package com.sda.primes;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException, TimeoutException {

        Instant start = Instant.now();
        int cnt;
        cnt = getPrimeCountSingleThreaded();
        System.out.println("ST: found: " + cnt + " in: " + Duration.between(start, Instant.now()));

        start = Instant.now();
        cnt = getPrimeCountMultiThreaded();
        System.out.println("MT: found: " + cnt + " in: " + Duration.between(start, Instant.now()));

    }

    private static int getPrimeCountMultiThreaded() throws IOException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(16);

        Path source = Paths.get("src", "main", "resources", "primes", "numbers.txt");
        try (Scanner scanner = new Scanner(source)) {

            AtomicInteger cnt = new AtomicInteger();
            while (scanner.hasNext()) {
                int number = scanner.nextInt();

                executorService.submit(() -> {
                    if (isPrime(number)) {
                        cnt.incrementAndGet();
                    }
                });
            }

            executorService.shutdown();
            boolean finished = executorService.awaitTermination(3, TimeUnit.MINUTES);
            if (!finished) {
                System.out.println("Not enough time");
            }

            return cnt.get();
        }
    }

    private static int getPrimeCountSingleThreaded() throws IOException {
        Path source = Paths.get("src", "main", "resources", "primes", "numbers.txt");
        try (Scanner scanner = new Scanner(source)) {

            int cnt = 0;
            while (scanner.hasNext()) {
                if (isPrime(scanner.nextInt())) {
                    cnt++;
                }
            }

            return cnt;
        }
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

    private static boolean isPrimeFaster(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (long i = 3; i < Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
