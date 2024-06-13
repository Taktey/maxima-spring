package ru.maxima;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Radio radio = context.getBean("radioMaxima", RadioMaxima.class);

        RadioPlayer player = new RadioPlayer(radio);
        player.playRadio();

        radio = context.getBean("radioEnergy", RadioEnergy.class);
        player = new RadioPlayer(radio);
        player.playRadio();


        radio = context.getBean("radioRecord", RadioRecord.class);
        player = new RadioPlayer(radio);
        player.playRadio();

    }
}
