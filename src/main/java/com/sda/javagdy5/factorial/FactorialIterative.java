package com.sda.javagdy5.factorial;

import java.math.BigInteger;

public class FactorialIterative implements Factorial {

    @Override
    public BigInteger calculate(int number) {
        BigInteger currentValue = BigInteger.ONE;

        for (int i = 0; i < number; i++) {
            currentValue = currentValue.multiply(BigInteger.valueOf(i + 1));
        }

        return currentValue;

    }
}
