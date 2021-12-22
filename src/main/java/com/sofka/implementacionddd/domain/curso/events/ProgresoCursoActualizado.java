package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.Estado;

public class ProgresoCursoActualizado extends DomainEvent {
    private Estado estado;

    public ProgresoCursoActualizado(Estado estado) {
        super("sofka.implementacionddd.curso.progresocursoactualizado");
        this.estado = estado;
    }
}
