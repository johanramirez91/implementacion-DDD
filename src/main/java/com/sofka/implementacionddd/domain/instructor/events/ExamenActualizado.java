package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;
import com.sofka.implementacionddd.domain.instructor.values.ExamenId;
import com.sofka.implementacionddd.domain.instructor.values.Preguntas;
import com.sofka.implementacionddd.domain.instructor.values.Proyecto;

public class ExamenActualizado extends DomainEvent {
    private final ExamenId examenId;
    private final Preguntas preguntas;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public ExamenActualizado(ExamenId examenId, Preguntas preguntas, Proyecto proyecto, Calificacion calificacion){
        super("sofka.implementacionddd.instructor.examenactualizado");
        this.examenId = examenId;
        this.preguntas = preguntas;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public ExamenId getExamenId() {
        return examenId;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
