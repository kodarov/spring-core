package ru.kodarovs.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        /**
         * DI через контроллер
         */
        MusicPlayer musicPlayer0 = context.getBean("musicPlayerWithConstructor", MusicPlayer.class);
        musicPlayer0.playMusic();
        /**
         * DI через сеттер
         */
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerWithConstructor", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerWithSetter", MusicPlayer.class);
        musicPlayer2.playMusic();
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());
        System.out.println(musicPlayer0 == musicPlayer1); // True - scope Singletone
        context.close();
    }
}
