package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(List.of("Марти", "Глории", "Мелман"), lionAlex.getFriends());
    }

    @Test
    void getPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йорк", lionAlex.getPlaceOfLiving());
    }

    @Test
    void getKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());
    }






    @Test
    void testGetKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);

    }

    @Test
    void doesHaveMane() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    void getFood() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionAlex.getFood());
    }
}