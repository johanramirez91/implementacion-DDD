package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.*;

public class AgregarExamen extends Command {
    private final InstructorId instructorId;
    private final ExamenId examenId;
    private final Preguntas preguntas;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public AgregarExamen(InstructorId instructorId, ExamenId examenId, Preguntas preguntas, Proyecto proyecto, Calificacion calificacion) {
        this.instructorId = instructorId;
        this.examenId = examenId;
        this.preguntas = preguntas;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public ExamenId getExamenId() {
        return examenId;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
