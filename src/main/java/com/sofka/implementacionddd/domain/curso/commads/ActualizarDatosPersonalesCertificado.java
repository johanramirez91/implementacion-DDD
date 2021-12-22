package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class ActualizarDatosPersonalesCertificado extends Command {

    private final DatosPersonales datosPersonales;
    private final EstudiosoId estudiosoId;

    public ActualizarDatosPersonalesCertificado(DatosPersonales datosPersonales, EstudiosoId estudiosoId) {
        this.datosPersonales = datosPersonales;
        this.estudiosoId = estudiosoId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }
}
