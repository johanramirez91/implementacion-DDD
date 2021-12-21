package com.sofka.implementacionddd.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Date;

public class FechaAsesoriaAsignada extends DomainEvent {
    private final Date fecha;

    public FechaAsesoriaAsignada(Date fecha) {
        super("sofka.implementacionddd.instructor.fechaasesoriaasignada");
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}
