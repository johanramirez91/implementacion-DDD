package com.sofka.implementacionddd.domain.curso;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionddd.domain.curso.values.CertificadoId;
import com.sofka.implementacionddd.domain.curso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.curso.values.Vigencia;

import java.util.Objects;

public class Certificado extends Entity<CertificadoId> {
    private DatosPersonales datosPersonales;
    private Vigencia vigencia;

    public Certificado(CertificadoId certificadoId, DatosPersonales datosPersonales, Vigencia vigencia) {
        super(certificadoId);
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
        this.vigencia = Objects.requireNonNull(vigencia);
    }

    public void cambiarDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void cambiarVigencia(Vigencia vigencia) {
        this.vigencia = Objects.requireNonNull(vigencia);
    }
}
