package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.Proyecto;

public class ProyectoEditado extends DomainEvent {
    private Proyecto proyecto;

    public ProyectoEditado(Proyecto proyecto) {
        super("sofka.implementacionddd.instructor.proyectoeditado");
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
