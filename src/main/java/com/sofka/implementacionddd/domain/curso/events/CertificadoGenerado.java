package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.values.CertificadoId;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class CertificadoGenerado extends DomainEvent {

    private final CertificadoId certificadoId;
    private final EstudiosoId estudiosoId;
    private final DatosPersonales datosPersonales;

    public CertificadoGenerado(CertificadoId certificadoId, EstudiosoId estudiosoId, DatosPersonales datosPersonales) {
        super("sofka.implementacionddd.curso.certificadogenerado");
        this.certificadoId = certificadoId;
        this.estudiosoId = estudiosoId;
        this.datosPersonales = datosPersonales;
    }

    public CertificadoId getCertificadoId() {
        return certificadoId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
