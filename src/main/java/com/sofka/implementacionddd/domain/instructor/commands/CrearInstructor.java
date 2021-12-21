package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.DatosPersonales;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

import java.util.Objects;

public class CrearInstructor extends Command {

    private final InstructorId instructorId;
    private final DatosPersonales datosPersonales;

    public CrearInstructor(InstructorId instructorId, DatosPersonales datosPersonales){
        this.instructorId = Objects.requireNonNull(instructorId);
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
