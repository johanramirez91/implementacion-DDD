package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

public class AgregarInstructor extends Command {

    private InstructorId instructorId;

    public AgregarInstructor(InstructorId instructorId) {
        this.instructorId = instructorId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }
}
