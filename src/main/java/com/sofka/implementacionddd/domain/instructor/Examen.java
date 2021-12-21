package com.sofka.implementacionddd.domain.instructor;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;
import com.sofka.implementacionddd.domain.instructor.values.ExamenId;
import com.sofka.implementacionddd.domain.instructor.values.Preguntas;
import com.sofka.implementacionddd.domain.instructor.values.Proyecto;

import java.util.Objects;

public class Examen extends Entity<ExamenId> {
    private Proyecto proyecto;
    private Calificacion calificacion;
    private Preguntas preguntas;

    public Examen(ExamenId examenId, Proyecto proyecto, Calificacion calificacion, Preguntas preguntas) {
        super(examenId);
        this.proyecto = proyecto;
        this.calificacion = calificacion;
        this.preguntas = preguntas;
    }

    public void editarProyecto(Proyecto proyecto) {
        this.proyecto = Objects.requireNonNull(proyecto);
    }

    public void calcularCalificacionProyecto(Calificacion calificacion, Proyecto proyecto) {
        this.calificacion = calificacion;
        this.proyecto = Objects.requireNonNull(proyecto);
    }

    public void editarPreguntas(Preguntas preguntas) {
        this.preguntas = Objects.requireNonNull(preguntas);
    }

    public void calcularCalificacionExamen(Calificacion calificacion, Preguntas preguntas) {
        this.calificacion = Objects.requireNonNull(calificacion);
        this.preguntas = Objects.requireNonNull(preguntas);
    }

    public Proyecto Proyecto() {
        return proyecto;
    }

    public Calificacion Calificacion() {
        return calificacion;
    }

    public Preguntas Preguntas() {
        return preguntas;
    }
}
