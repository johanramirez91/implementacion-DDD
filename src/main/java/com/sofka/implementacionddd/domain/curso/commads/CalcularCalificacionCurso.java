package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;

public class CalcularCalificacionCurso extends Command {

    private final Calificacion calificacion;
    private final EstudiosoId estudiosoId;

    public CalcularCalificacionCurso(Calificacion calificacion, EstudiosoId estudiosoId) {
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
