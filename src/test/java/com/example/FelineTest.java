package com.example;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {


    @Test
    void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    void getKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(1));
    }


    @Test
    void eatMeat() throws Exception {
        Feline feline = new Feline();
        List str = feline.getFood("Хищник");
        assertEquals(str, feline.eatMeat());
    }
}