package com.sofka.implementacionddd.instructor;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionddd.instructor.values.AsesoriaId;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Asesoria extends Entity<AsesoriaId> {
    private Time duracion;
    private Date fecha;
    private String tema;

    public Asesoria(AsesoriaId asesoriaId, Time duracion, Date fecha, String tema) {
        super(asesoriaId);
        this.duracion = duracion;
        this.fecha = fecha;
        this.tema = tema;
    }

    public void asignarDuracion(Time duracion) {
        this.duracion = Objects.requireNonNull(duracion);
    }

    public void asignarFecha(Date fecha) {
        this.fecha = Objects.requireNonNull(fecha);
    }

    public void asignarTema(String tema) {
        this.tema = Objects.requireNonNull(tema);
    }
}
