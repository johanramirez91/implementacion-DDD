package com.sofka.implementacionddd.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.instructor.values.DatosPersonales;

public class InstructorCreado extends DomainEvent {
    private final DatosPersonales datosPersonales;

    public InstructorCreado(DatosPersonales datosPersonales) {
        super("sofka.implementacionddd.instructor.instructorcreado");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }
}
