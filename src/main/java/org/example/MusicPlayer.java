package org.example;

import org.example.MusicGenre;
import org.example.PlayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MusicPlayer {
    private final Map<MusicGenre, PlayList> genrePlayListMap;

    @Autowired
    public MusicPlayer(
            @Qualifier("classicalMusic") PlayList classical,
            @Qualifier("rockMusic") PlayList rock,
            @Qualifier("jazzMusic") PlayList jazz
    ) {
        genrePlayListMap = new HashMap<>();
        genrePlayListMap.put(MusicGenre.CLASSICAL, classical);
        genrePlayListMap.put(MusicGenre.ROCK, rock);
        genrePlayListMap.put(MusicGenre.JAZZ, jazz);
    }

    public void playGenrePlaylist(MusicGenre genre) {
        PlayList playList = genrePlayListMap.get(genre);
        if (playList != null) {
            List<String> songs = playList.playlistPlay();
            System.out.println("Playing " + genre + " playlist:");
            songs.forEach(System.out::println);
        } else {
            System.out.println("No playlist found for genre: " + genre);
        }
    }
}