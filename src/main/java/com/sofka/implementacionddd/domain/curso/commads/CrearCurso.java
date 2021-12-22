package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.values.CursoId;

import java.util.Objects;

public class CrearCurso extends Command {

    private final CursoId cursoId;

    public CrearCurso(CursoId cursoId) {
        this.cursoId = Objects.requireNonNull(cursoId);
    }

    public CursoId getCursoId() {
        return cursoId;
    }
}
