package com.sofka.implementacionddd.domain.curso;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionddd.domain.curso.values.VideoId;

import java.sql.Time;
import java.util.Objects;

public class Video extends Entity<VideoId> {

    private Time duracion;
    private Integer progreso;
    private Integer puntos;

    public Video(VideoId videoId, Time duracion, Integer progreso, Integer puntos){
        super(videoId);
        this.duracion = Objects.requireNonNull(duracion);
        this.progreso = Objects.requireNonNull(progreso);
        this.puntos = Objects.requireNonNull(puntos);
    }

    public void asignarDuracion(Time duracion) {
        this.duracion = Objects.requireNonNull(duracion);
    }

    public void aumentarPuntos(Integer progreso){
        this.progreso = Objects.requireNonNull(progreso) + puntos;
    }

}
