package com.sofka.implementacionddd.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.instructor.values.InstructorId;

import java.sql.Time;

public class AsignarDuracionAsesoria extends Command {
    private final InstructorId instructorId;
    private final Time duracion;

    public AsignarDuracionAsesoria(InstructorId instructorId, Time duracion) {
        this.instructorId = instructorId;
        this.duracion = duracion;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Time getDuracion() {
        return duracion;
    }
}
