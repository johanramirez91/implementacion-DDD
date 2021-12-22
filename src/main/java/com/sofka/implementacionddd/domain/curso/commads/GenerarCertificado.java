package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.values.CertificadoId;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class GenerarCertificado extends Command {

    private final CertificadoId certificadoId;
    private final EstudiosoId estudiosoId;
    private final DatosPersonales datosPersonales;

    public GenerarCertificado(CertificadoId certificadoId, EstudiosoId estudiosoId, DatosPersonales datosPersonales) {
        this.certificadoId = certificadoId;
        this.estudiosoId = estudiosoId;
        this.datosPersonales = datosPersonales;
    }

    public CertificadoId getCertificado() {
        return certificadoId;
    }

    public EstudiosoId getEstudiosoId() {
        return estudiosoId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}

