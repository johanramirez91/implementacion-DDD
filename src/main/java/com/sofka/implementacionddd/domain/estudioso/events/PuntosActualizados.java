package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.Puntaje;

public class PuntosActualizados extends DomainEvent {
    private final Puntaje puntaje;

    public PuntosActualizados(Puntaje puntaje) {
        super("sofka.implementacionddd.estudioso.puntosactualizados");
        this.puntaje = puntaje;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
