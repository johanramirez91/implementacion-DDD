package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.values.CursoId;

public class CursoCreado extends DomainEvent {
    private final CursoId cursoId;

    public CursoCreado(CursoId cursoId) {
        super("sofka.implementacionddd.curso.cursocreado");
        this.cursoId = cursoId;
    }

    public CursoId CursoId() {
        return cursoId;
    }
}
