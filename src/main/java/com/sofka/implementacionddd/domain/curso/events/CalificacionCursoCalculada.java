package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;

public class CalificacionCursoCalculada extends DomainEvent {
    private final Calificacion calificacion;

    public CalificacionCursoCalculada(Calificacion calificacion) {
        super("sofka.implementacionddd.curso.calificacioncursocalculada");
        this.calificacion = calificacion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
