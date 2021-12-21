package com.sofka.implementacionddd.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Date;

public class TemaAsesoriaAsignado extends DomainEvent {
    private final String tema;

    public TemaAsesoriaAsignado(String tema) {
        super("sofka.implementacionddd.instructor.temaasesoriaasignado");
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }
}
