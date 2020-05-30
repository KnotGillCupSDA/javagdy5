package com.sda.javagdy5.pantadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String filePath = "src//resources//pan-tadeusz.txt";

        // NIO - get readonly input stream
        // InputStream inputStream = Files.newInputStream(Paths.get(filePath), StandardOpenOption.READ);

        // NIO - file line by line as Stream
        // Files.lines(Paths.get(filePath));

        // using scanner

        Map<String, Integer> wordsCount = new HashMap<>();

        File sourceFile = new File(filePath);
        try (Scanner scanner = new Scanner(sourceFile)) {
            while (scanner.hasNext()) {
                String nextLine = scanner.nextLine();
                String normalized = nextLine.replaceAll("[^a-zA-Ząćęłńóśźż]", " ");
                String[] words = normalized.split(" ");

                // hints:
                // wordsCount.containsKey();
                // Integer count = wordsCount.get();
                // wordsCount.put();


                //hint 2
                List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordsCount.entrySet());
                entries.sort(new Comparator<>() {

                    /**
                     * Compares its two arguments for order.  Returns a negative integer,
                     * zero, or a positive integer as the first argument is less than, equal
                     * to, or greater than the second.<p>
                     */
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {


                        return 0;
                    }
                });

                // alternatively
                // Comparator.comparingInt()

            }
        }

    }
}
