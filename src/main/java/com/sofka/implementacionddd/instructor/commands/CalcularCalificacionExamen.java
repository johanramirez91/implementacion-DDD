package com.sofka.implementacionddd.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.instructor.values.Calificacion;
import com.sofka.implementacionddd.instructor.values.InstructorId;
import com.sofka.implementacionddd.instructor.values.Preguntas;

public class CalcularCalificacionExamen extends Command {
    private final InstructorId instructorId;
    private final Preguntas preguntas;
    private final Calificacion calificacion;

    public CalcularCalificacionExamen(InstructorId instructorId, Preguntas preguntas, Calificacion calificacion) {
        this.instructorId = instructorId;
        this.preguntas = preguntas;
        this.calificacion = calificacion;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
