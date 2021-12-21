package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.Descripcion;
import com.sofka.implementacionddd.domain.estudioso.values.PreguntaId;

public class PreguntaAgregada extends DomainEvent {
    private final PreguntaId preguntaId;
    private final Descripcion descripcion;

    public PreguntaAgregada(PreguntaId preguntaId, Descripcion descripcion) {
        super("sofka.implementacionddd.estudioso.preguntaagregada");
        this.preguntaId = preguntaId;
        this.descripcion = descripcion;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
