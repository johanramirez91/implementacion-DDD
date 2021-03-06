package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;
import com.sofka.implementacionddd.domain.instructor.values.Preguntas;

public class ActualizarExamen extends Command {
    private final InstructorId instructorId;
    private final Preguntas preguntas;

    public ActualizarExamen(InstructorId instructorId, Preguntas preguntas) {
        this.instructorId = instructorId;
        this.preguntas = preguntas;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }
}
