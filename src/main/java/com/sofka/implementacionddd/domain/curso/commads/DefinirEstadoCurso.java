package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.Estado;

public class DefinirEstadoCurso extends Command {

    private final Estado estado;

    public DefinirEstadoCurso(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
