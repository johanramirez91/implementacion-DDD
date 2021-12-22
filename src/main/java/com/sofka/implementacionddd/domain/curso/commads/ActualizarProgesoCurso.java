package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.Estado;

public class ActualizarProgesoCurso extends Command {
    private final Estado estado;

    public ActualizarProgesoCurso(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
