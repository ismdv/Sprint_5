package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedFelineTests {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,3"})
    void testGetKittens(int kittensCount, int expectedKittens) {
        Feline feline = new Feline();
        assertEquals(expectedKittens, feline.getKittens(kittensCount));
    }


}



