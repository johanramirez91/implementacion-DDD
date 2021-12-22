package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.Estado;

public class EstadoCursoDefinido extends DomainEvent {

    private final Estado estado;

    public EstadoCursoDefinido(Estado estado) {
        super("sofka.implementacionddd.curso.estadocursodefinido");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
