package com.sda.javagdy5.factorial;

import java.math.BigInteger;

public class FactorialRecursive implements Factorial {

    @Override
    public BigInteger calculate(int number) {

        if(number == 0) {
            return BigInteger.ONE;
        }

        BigInteger currentValue = BigInteger.valueOf(number);
        return currentValue.multiply(calculate(number-1));
    }
}
