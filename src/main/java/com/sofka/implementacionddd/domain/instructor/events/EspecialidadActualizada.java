package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.Especialidad;

public class EspecialidadActualizada extends DomainEvent {
    private final Especialidad especialidad;

    public EspecialidadActualizada(Especialidad especialidad){
        super("sofka.implementacionddd.instructor.especialidadactualizada");
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
