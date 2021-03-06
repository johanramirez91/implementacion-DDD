package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.DatosPersonales;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

public class ActualizarDatosPersonales extends Command {
    private final InstructorId instructorId;
    private final DatosPersonales datosPersonales;

    public ActualizarDatosPersonales(InstructorId instructorId, DatosPersonales datosPersonales) {
        this.instructorId = instructorId;
        this.datosPersonales = datosPersonales;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
