package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

import java.util.Date;

public class AsignarFechaAsesoria extends Command {
    private final InstructorId instructorId;
    private final Date fecha;

    public AsignarFechaAsesoria(InstructorId instructorId, Date fecha) {
        this.instructorId = instructorId;
        this.fecha = fecha;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Date getFecha() {
        return fecha;
    }
}
