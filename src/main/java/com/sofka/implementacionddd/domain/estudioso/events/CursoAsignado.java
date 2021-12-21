package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.Curso;

public class CursoAsignado extends DomainEvent {
    private final Curso curso;

    public CursoAsignado(Curso curso){
        super("sofka.implementacionddd.estudioso.cursoasignado");
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}
