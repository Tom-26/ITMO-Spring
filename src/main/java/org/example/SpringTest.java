package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean(MusicPlayer.class);
        player.playGenrePlaylist(MusicGenre.ROCK);



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
