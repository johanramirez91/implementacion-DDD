package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.values.Vigencia;

public class VigenciaCertificadoActualizada extends DomainEvent {

    private final Vigencia vigencia;

    public VigenciaCertificadoActualizada(Vigencia vigencia) {
        super("sofka.implementacionddd.curso.vigenciacertificadoactualizada");
        this.vigencia = vigencia;
    }

    public Vigencia getVigencia() {
        return vigencia;
    }
}
