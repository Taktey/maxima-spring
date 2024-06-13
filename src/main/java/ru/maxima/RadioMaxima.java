package ru.maxima;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("radioMaxima")
public class RadioMaxima implements Radio {
    private List<String> songs = Arrays
            .asList("metallica - am i evil",
                    "Led Zeppelin - Since i've been living you",
                    "Rammstein - Deutschland");

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
