package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.AsesoriaId;

public class AsesoriaSolicitada extends DomainEvent {
    private AsesoriaId asesoriaId;

    public AsesoriaSolicitada(AsesoriaId asesoriaId) {
        super("sofka.implementacionddd.estudioso.asesoriasolicitada");
        this.asesoriaId = asesoriaId;
    }

    public AsesoriaId getAsesoriaId() {
        return asesoriaId;
    }
}
