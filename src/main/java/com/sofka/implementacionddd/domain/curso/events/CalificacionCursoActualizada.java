package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;

public class CalificacionCursoActualizada extends DomainEvent {
    private final Calificacion calificacion;
    private final EstudiosoId estudiosoId;

    public CalificacionCursoActualizada(Calificacion calificacion, EstudiosoId estudiosoId) {
        super("sofka.implementacionddd.curso.calificacioncursoactualizada");
        this.calificacion = calificacion;
        this.estudiosoId = estudiosoId;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }
}
