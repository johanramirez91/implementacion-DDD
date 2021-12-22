package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.values.VideoId;

import java.sql.Time;

public class DefinirDuracionVideo extends Command {

    private final VideoId videoId;
    private final Time duracion;

    public VideoId getVideoId() {
        return videoId;
    }

    public Time getDuracion() {
        return duracion;
    }

    public DefinirDuracionVideo(VideoId videoId, Time duracion) {
        this.videoId = videoId;
        this.duracion = duracion;


    }
}
