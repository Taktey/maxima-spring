package ru.maxima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component("radioRecord")
public class RadioRecord implements Radio {
    private List<String> songs = Arrays
            .asList("Вечерние новости",
                    "Gasoline - I Prevail",
                    "Break Stuff - Limp Bizkit");

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
