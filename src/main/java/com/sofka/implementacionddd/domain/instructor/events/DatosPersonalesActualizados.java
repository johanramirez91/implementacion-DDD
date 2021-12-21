package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.DatosPersonales;

public class DatosPersonalesActualizados extends DomainEvent {
    private final DatosPersonales datosPersonales;

    public DatosPersonalesActualizados(DatosPersonales datosPersonales){
        super("sofka.implementacionddd.instructor.datosPersonalesactualizados");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
