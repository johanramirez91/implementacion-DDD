package com.sofka.implementacionddd.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.instructor.values.Proyecto;

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
