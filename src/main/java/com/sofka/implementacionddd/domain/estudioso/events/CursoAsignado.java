package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.values.CursoId;

public class CursoAsignado extends DomainEvent {
    private final CursoId cursoId;

    public CursoAsignado(CursoId cursoId){
        super("sofka.implementacionddd.estudioso.cursoasignado");
        this.cursoId = cursoId;
    }

    public CursoId getCurso() {
        return cursoId;
    }
}
