package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.values.VideoId;

import java.sql.Time;

public class DuracionVideoDefinida extends DomainEvent {

    private final VideoId videoId;
    private final Time duracion;

    public DuracionVideoDefinida(VideoId videoId, Time duracion) {
        super("sofka.implementacionddd.curso.duracionvideodefinida");
        this.videoId = videoId;
        this.duracion = duracion;
    }

    public VideoId getVideoId() {
        return videoId;
    }

    public Time getDuracion() {
        return duracion;
    }
}
