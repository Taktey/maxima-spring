package ru.maxima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("radioPlayer")
public class RadioPlayer {
    private Radio radio1;
    private Radio radio2;
    private Radio radio3;
    @Autowired
    public RadioPlayer(@Qualifier("radioEnergy")Radio radio1,
                       @Qualifier("radioMaxima")Radio radio2,
                       @Qualifier("radioRecord")Radio radio3) {
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
    }
    public void playRadio(){
        System.out.println(radio1.getSongs());
        System.out.println(radio2.getSongs());
        System.out.println(radio3.getSongs());
    }
}