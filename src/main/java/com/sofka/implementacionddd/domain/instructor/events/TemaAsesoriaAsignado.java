package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;

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
