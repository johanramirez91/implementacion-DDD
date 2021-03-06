package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;
import com.sofka.implementacionddd.domain.instructor.values.Preguntas;

public class CalificacionExamenCalculada extends DomainEvent {
    private Preguntas preguntas;
    private Calificacion calificacion;

    public CalificacionExamenCalculada(Preguntas preguntas, Calificacion calificacion){
        super("sofka.implementacionddd.instructor.calificacionexamencalculada");
        this.calificacion = calificacion;
        this.preguntas = preguntas;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
