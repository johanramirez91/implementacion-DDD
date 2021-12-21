package com.sofka.implementacionddd.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.instructor.values.Especialidad;
import com.sofka.implementacionddd.instructor.values.InstructorId;

public class ActualizarEspecialidad extends Command {

    private final InstructorId instructorId;
    private final Especialidad especialidad;

    public ActualizarEspecialidad(InstructorId instructorId, Especialidad especialidad) {
        this.instructorId = instructorId;
        this.especialidad = especialidad;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
