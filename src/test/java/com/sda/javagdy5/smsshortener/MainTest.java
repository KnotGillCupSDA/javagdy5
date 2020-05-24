package com.sda.javagdy5.smsshortener;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void thatSmsCanBeShortened() {
        Assertions.assertEquals("DzisiajJestSobota,ImieninyKota",
            Main.shortenSms("Dzisiaj jest sobota, imieniny kota"));
    }

    @Test
    void thatWeHandleDoubleSpaces() {
        Assertions.assertEquals("TestNaWieleSpacji",
            Main.shortenSms("test  na    wiele spacji"));
    }

    @Test
    void thatWeHandleSpecialCharacters() {
        Assertions.assertEquals("CzyTo#$%JestOk?TestSpecjalnychZaków!",
            Main.shortenSms("Czy to #$% jest ok? test specjalnych zaków!"));
    }

    @Test
    void thatWeThrowIllegalArgumentExceptionWhenSmsIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> Main.shortenSms(null));
    }
}