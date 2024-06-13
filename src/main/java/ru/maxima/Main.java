package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RadioPlayer player = new RadioPlayer(
                context.getBean("radioEnergy", RadioMaxima.class),
                context.getBean("radioMaxima", RadioMaxima.class),
                context.getBean("radioRecord", RadioMaxima.class));
        player.playRadio();
    }
}
