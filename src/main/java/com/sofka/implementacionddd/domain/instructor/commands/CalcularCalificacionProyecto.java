package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;
import com.sofka.implementacionddd.domain.instructor.values.Proyecto;

public class CalcularCalificacionProyecto extends Command {
    private final InstructorId instructorId;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public CalcularCalificacionProyecto(InstructorId instructorId, Proyecto proyecto, Calificacion calificacion) {
        this.instructorId = instructorId;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
