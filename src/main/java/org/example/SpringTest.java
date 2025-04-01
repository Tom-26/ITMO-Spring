package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        //prototype
        JazzMusic jazzMusic1 = context.getBean("jazzMusic", JazzMusic.class);
        JazzMusic jazzMusic2 = context.getBean("jazzMusic", JazzMusic.class);
        //singletole
        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(jazzMusic1==jazzMusic2); //false
        System.out.println(rockMusic1==rockMusic2); //true


//        Computer computer= context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        Music music= context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicBean", MusicPlayer.class);
//        PlayListManager playListManager1 = context.getBean("musicBean", PlayListManager.class);
//        PlayListManager playListManager2 = context.getBean("musicBean", PlayListManager.class);
//        Music music = context.getBean("jazzMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playSingleSong(music);

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer.getVolume());
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        System.out.println(musicPlayer1==musicPlayer);
        context.close();
    }
}
