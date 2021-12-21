package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.instructor.values.AsesoriaId;

public class SolicitarAsesoria extends Command {

    private final AsesoriaId asesoriaId;
    private final EstudiosoId estudiosoId;

    public SolicitarAsesoria(AsesoriaId asesoriaId, EstudiosoId estudiosoId) {
        this.asesoriaId = asesoriaId;
        this.estudiosoId = estudiosoId;
    }

    public AsesoriaId getAsesoriaId() {
        return asesoriaId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }
}
