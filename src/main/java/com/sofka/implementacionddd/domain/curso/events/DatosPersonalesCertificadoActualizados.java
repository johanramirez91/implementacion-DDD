package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class DatosPersonalesCertificadoActualizados extends DomainEvent {

    private final DatosPersonales datosPersonales;
    private final EstudiosoId estudiosoId;

    public DatosPersonalesCertificadoActualizados(DatosPersonales datosPersonales, EstudiosoId estudiosoId) {
        super("sofka.implementacionddd.curso.datospersonalesactualizados");
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
