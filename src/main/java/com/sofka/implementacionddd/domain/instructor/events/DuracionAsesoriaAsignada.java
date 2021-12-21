package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.sql.Time;

public class DuracionAsesoriaAsignada extends DomainEvent {
    private final Time duracion;

    public DuracionAsesoriaAsignada(Time duracion){
        super("sofka.implementacionddd.instructor.duracionasesoriaasignada");
        this.duracion = duracion;
    }

    public Time getDuracion() {
        return duracion;
    }
}
