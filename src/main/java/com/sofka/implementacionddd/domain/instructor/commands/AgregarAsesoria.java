package com.sofka.implementacionddd.domain.instructor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.instructor.values.AsesoriaId;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

import java.sql.Time;
import java.util.Date;

public class AgregarAsesoria extends Command {
    private final InstructorId instructorId;
    private final AsesoriaId asesoriaId;
    private final Time duracion;
    private final Date fecha;
    private final String tema;

    public AgregarAsesoria(InstructorId instructorId, AsesoriaId asesoriaId, Time duracion, Date fecha, String tema) {
        this.instructorId = instructorId;
        this.asesoriaId = asesoriaId;
        this.duracion = duracion;
        this.fecha = fecha;
        this.tema = tema;
    }

    public InstructorId getInstructorId() {
        return instructorId;
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
