package com.sofka.implementacionddd.domain.instructor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.values.AsesoriaId;

import java.sql.Time;
import java.util.Date;

public class AsesoriaAgregada extends DomainEvent {
    private final AsesoriaId asesoriaId;
    private final Time duracion;
    private final Date fecha;
    private final String tema;

    public AsesoriaAgregada(AsesoriaId asesoriaId, Time duracion, Date fecha, String tema) {
        super("sofka.implementacionddd.instructor.asesoriaagregada");
        this.asesoriaId = asesoriaId;
        this.duracion = duracion;
        this.fecha = fecha;
        this.tema = tema;
    }

    public AsesoriaId getAsesoriaId() {
        return asesoriaId;
    }

    public Time getDuracion() {
        return duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTema() {
        return tema;
    }
}
