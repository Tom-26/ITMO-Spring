package org.example;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RockMusic implements Music, PlayList{
    @Override
    public String getSong() {
        return "Hightway to hell";
    }

    @Override
    public List<String> playlistPlay() {
        return List.of("black in black", "rock beast", "dumb");
    }
}
