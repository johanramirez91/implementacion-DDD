package com.sofka.implementacionddd.domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

public class InstructorAgregado extends DomainEvent {

    private final InstructorId instructorId;

    public InstructorAgregado(InstructorId instructorId) {
        super("sofka.implementacionddd.curso.instructoragregado");
        this.instructorId = instructorId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }
}
