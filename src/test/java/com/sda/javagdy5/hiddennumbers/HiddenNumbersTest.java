package com.sda.javagdy5.hiddennumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HiddenNumbersTest {

    @Test
    void thatWeAddNumbers() {
        HiddenNumbers hiddenNumbers = new HiddenNumbers();

        Assertions.assertEquals(123,
            hiddenNumbers.calculate("abc123xyz"));

        Assertions.assertEquals(44,
            hiddenNumbers.calculate("aa11b33"));

        Assertions.assertEquals(20,
            hiddenNumbers.calculate("7 13"));

        Assertions.assertEquals(-22,
            hiddenNumbers.calculate("aa11b-33"));

        Assertions.assertEquals(44,
            hiddenNumbers.calculate("aa11b33-fsdf"));
    }
}