package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.values.CursoId;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class AsignarCurso extends Command {

    private final CursoId cursoId;
    private final EstudiosoId estudiosoId;

    public AsignarCurso(CursoId cursoId, EstudiosoId estudiosoId) {
        this.cursoId = cursoId;
        this.estudiosoId = estudiosoId;
    }

    public CursoId getCursoId() {
        return cursoId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }
}
