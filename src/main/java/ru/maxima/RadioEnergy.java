package ru.maxima;

import java.util.ArrayList;
import java.util.List;

public class RadioEnergy implements Radio{
    private List<String> songs = new ArrayList<>();

    public RadioEnergy(String song1, String song2, String song3) {
        this.songs.add(song1);
        this.songs.add(song2);
        this.songs.add(song3);
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
