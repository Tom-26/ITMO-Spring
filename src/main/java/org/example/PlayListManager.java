package org.example;

import java.util.List;

public class PlayListManager implements PlayList{
    private PlayListManager() {
    }
     public static PlayListManager getPlayListManager(){
        return new PlayListManager();
     }

    public void doMyInit(){
        System.out.println("doing init");
    }
    public void doMyDestroy(){
        System.out.println("doing my destr");
    }
    @Override
    public List<String> playlistPlay() {
        return List.of();
    }


}
