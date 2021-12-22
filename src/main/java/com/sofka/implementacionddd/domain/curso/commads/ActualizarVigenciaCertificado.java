package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.curso.values.CertificadoId;
import com.sofka.implementacionddd.domain.curso.values.Vigencia;

public class ActualizarVigenciaCertificado extends Command {

    private final CertificadoId certificadoId;
    private final Vigencia vigencia;

    public ActualizarVigenciaCertificado(CertificadoId certificadoId, Vigencia vigencia) {
        this.certificadoId = certificadoId;
        this.vigencia = vigencia;
    }

    public CertificadoId getCertificadoId() {
        return certificadoId;
    }

    public Vigencia getVigencia() {
        return vigencia;
    }
}
