package com.sda.javagdy5.hiddennumbers;

import java.util.Arrays;

public class HiddenNumbers {

    public int calculate(String text) {

        //String[] split = text.split("[^-?0-9]+|-[^0-9]|-$");
        String[] split = text.split("-?[0-9]");

        return Arrays.stream(split)
            .filter(s -> !s.isEmpty())
            .mapToInt(Integer::parseInt)
            .sum();
    }
}
