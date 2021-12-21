package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.estudioso.values.PreguntaId;

public class AgregarPregunta extends Command {

    private final EstudiosoId estudiosoId;
    private final PreguntaId preguntaId;

    public AgregarPregunta(EstudiosoId estudiosoId, PreguntaId preguntaId) {
        this.estudiosoId = estudiosoId;
        this.preguntaId = preguntaId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }
}
