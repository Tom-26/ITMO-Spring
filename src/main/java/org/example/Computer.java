package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    private long ID;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.ID = 1;
    }
}
  /*  @Override
    public String toString() {
        return "Computer{" +
                "ID=" + ID +
                ", musicPlayer=" + musicPlayer.playSingleSong() +
                '}';
    }
}
*/