package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;

public class EstudiosoCreado extends DomainEvent {
    private final DatosPersonales datosPersonales;


    public EstudiosoCreado(DatosPersonales datosPersonales) {
        super("sofka.implementacionddd.estudioso.estudiosocreado");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales datosPersonales(){
        return datosPersonales;
    }
}
