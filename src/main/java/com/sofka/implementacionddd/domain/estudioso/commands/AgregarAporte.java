package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.AporteId;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class AgregarAporte extends Command {

    private final AporteId aporteId;
    private final EstudiosoId estudiosoId;

    public AgregarAporte(AporteId aporteId, EstudiosoId estudiosoId) {
        this.aporteId = aporteId;
        this.estudiosoId = estudiosoId;
    }

    public AporteId getAporteId() {
        return aporteId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }
}
