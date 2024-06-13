package ru.maxima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("radioRecord")
public class RadioRecord implements Radio{
    private List<String> songs = new ArrayList<>();

    public RadioRecord(String song1, String song2, String song3) {
        this.songs.add(song1);
        this.songs.add(song2);
        this.songs.add(song3);
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
