package com.sofka.implementacionddd.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.instructor.values.InstructorId;
import com.sofka.implementacionddd.instructor.values.Proyecto;

public class EditarProyecto extends Command {
    private final InstructorId instructorId;
    private final Proyecto proyecto;

    public EditarProyecto(InstructorId instructorId, Proyecto proyecto) {
        this.instructorId = instructorId;
        this.proyecto = proyecto;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
