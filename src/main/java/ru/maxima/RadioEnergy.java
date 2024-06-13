package ru.maxima;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("radioEnergy")
public class RadioEnergy implements Radio {
    private List<String> songs = Arrays
            .asList("Гимн России - Ольга бузова",
                    "МС Вспышкин - меня прёт",
                    "Колбасный цех - колбаса");

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
