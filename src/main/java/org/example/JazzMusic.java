package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
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
