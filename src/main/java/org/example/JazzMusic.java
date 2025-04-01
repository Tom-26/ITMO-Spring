package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic implements Music, PlayList{

    @Override
    public String getSong() {
        return "Tutututututututututu";
    }

    @Override
    public List<String> playlistPlay() {
        return List.of("tu1"+ "tu2"+"tu3");
    }
}
