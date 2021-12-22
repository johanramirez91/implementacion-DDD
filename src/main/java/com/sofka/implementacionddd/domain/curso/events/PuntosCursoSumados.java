package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.estudioso.values.Puntaje;

public class PuntosCursoSumados extends DomainEvent {

    private final Puntaje puntaje;
    private final EstudiosoId estudiosoId;

    public PuntosCursoSumados(Puntaje puntaje, EstudiosoId estudiosoId) {
        super("sofka.implementacionddd.curso.puntoscursosumados");
        this.puntaje = puntaje;
        this.estudiosoId = estudiosoId;
    }
}
