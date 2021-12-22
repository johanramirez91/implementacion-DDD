package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class EstudiosoAgregado extends DomainEvent {

    private final EstudiosoId estudiosoId;

    public EstudiosoAgregado(EstudiosoId estudiosoId) {
        super("sofka.implementacionddd.curso.estudiosoagregado");
        this.estudiosoId = estudiosoId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }
}
