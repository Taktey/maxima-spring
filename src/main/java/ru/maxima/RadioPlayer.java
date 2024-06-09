package ru.maxima;

public class RadioPlayer {
    private Radio radio;
    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }
    public void playRadio(){
        System.out.println(radio.getSongs());
    }
}