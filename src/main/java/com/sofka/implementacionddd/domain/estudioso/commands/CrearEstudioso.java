package com.sofka.implementacionddd.domain.estudioso.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

import java.util.Objects;

public class CrearEstudioso extends Command {

    private final EstudiosoId estudiosoId;
    private final DatosPersonales datosPersonales;

    public CrearEstudioso(EstudiosoId estudiosoId, DatosPersonales datosPersonales) {
        this.estudiosoId = Objects.requireNonNull(estudiosoId);
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
