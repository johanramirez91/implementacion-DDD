package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.estudioso.values.Puntaje;

public class ActualizarPuntos extends Command {
    private final EstudiosoId estudiosoId;
    private final Puntaje puntaje;

    public ActualizarPuntos(EstudiosoId estudiosoId, Puntaje puntaje) {
        this.estudiosoId = estudiosoId;
        this.puntaje = puntaje;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
