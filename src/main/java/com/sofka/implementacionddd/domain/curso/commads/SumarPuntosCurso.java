package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.Puntaje;

public class SumarPuntosCurso extends Command {
    private final Puntaje puntaje;

    public SumarPuntosCurso(Puntaje puntaje) {
        this.puntaje = puntaje;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
