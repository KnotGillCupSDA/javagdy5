package com.sda.javagdy5.smsshortener;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Napisz tresc SMSa:");
        Scanner scanner = new Scanner(System.in);

        String smsText = scanner.nextLine();
        String shortSms = shortenSms(smsText);

        System.out.println(shortSms);

        System.out.println("Koszt to: " + (int) Math.ceil(shortSms.length() / 160.0));
    }

    /**
     * @throws IllegalArgumentException when null is passed
     */
    static String shortenSms(String smsText) {

        if (smsText == null) {
            throw new IllegalArgumentException("SMS cannot be null");
        }

        String[] words = smsText.split("\\s+");
        StringBuilder shortSms = new StringBuilder();
        for (String word : words) {

            String remainingLetters = word.substring(1);
            String firstLetter = word.substring(0, 1);

            shortSms
                .append(firstLetter.toUpperCase())
                .append(remainingLetters.toLowerCase());
        }

        return shortSms.toString();
    }
}
