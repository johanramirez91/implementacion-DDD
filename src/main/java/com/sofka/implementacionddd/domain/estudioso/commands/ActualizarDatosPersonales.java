package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class ActualizarDatosPersonales extends Command {

    private final EstudiosoId estudiosoId;
    private final DatosPersonales datosPersonales;

    public ActualizarDatosPersonales(EstudiosoId estudiosoId, DatosPersonales datosPersonales) {
        this.estudiosoId = estudiosoId;
        this.datosPersonales = datosPersonales;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
