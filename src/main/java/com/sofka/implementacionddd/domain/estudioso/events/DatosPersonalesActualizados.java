package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;

public class DatosPersonalesActualizados extends DomainEvent {

    private final DatosPersonales datosPersonales;

    public DatosPersonalesActualizados(DatosPersonales datosPersonales){
        super("sofka.implementacionddd.estudioso.datosPersonalesactualizados");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
