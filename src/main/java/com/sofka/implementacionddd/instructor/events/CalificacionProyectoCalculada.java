package com.sofka.implementacionddd.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.instructor.values.Calificacion;
import com.sofka.implementacionddd.instructor.values.Proyecto;

public class CalificacionProyectoCalculada extends DomainEvent {
    private Proyecto proyecto;
    private Calificacion calificacion;

    public CalificacionProyectoCalculada(Proyecto proyecto, Calificacion calificacion){
        super("sofka.implementacionddd.instructor.calificacionproyectocalculada");
        this.calificacion = calificacion;
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
