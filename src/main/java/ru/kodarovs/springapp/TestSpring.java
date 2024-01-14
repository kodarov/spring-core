package ru.kodarovs.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

/*        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
   */
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();
    }
}
