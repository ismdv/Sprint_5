package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class FelineTest {


    @Spy
    Feline feline = new Feline();


    @Test
    void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    void getKittens() {
        Mockito.when(feline.getKittens(1)).thenReturn(1);
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
        assertEquals(str,feline.eatMeat());
    }
}