package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глории", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йорк";
    }


    @Override
    public int getKittens() {
        return 0;
    }


}