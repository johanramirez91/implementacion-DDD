package com.sofka.implementacionddd.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.instructor.values.InstructorId;

public class AsignarTemaAsesoria extends Command {
    private final InstructorId instructorId;
    private final String tema;

    public AsignarTemaAsesoria(InstructorId instructorId, String tema) {
        this.instructorId = instructorId;
        this.tema = tema;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public String getTema() {
        return tema;
    }
}
