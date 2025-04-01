package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music, PlayList {

    @Override
    public String getSong() {
        return "Symphony 6";
    }

    @Override
    public List<String> playlistPlay() {
        return List.of("Chelkunchik"+"Lebedinoe ozero"+"ABBA");
    }
}
