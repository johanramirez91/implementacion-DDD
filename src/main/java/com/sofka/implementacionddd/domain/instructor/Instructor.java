package com.sofka.implementacionddd.domain.instructor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.instructor.events.*;
import com.sofka.implementacionddd.domain.instructor.values.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Instructor extends AggregateEvent<InstructorId> {

    protected DatosPersonales datosPersonales;
    protected Especialidad especialidad;
    protected Examen examen;
    protected Asesoria asesoria;

    public Instructor(InstructorId instructorIdId, DatosPersonales datosPersonales) {
        super(instructorIdId);
        appendChange(new InstructorCreado(datosPersonales)).apply();
    }

    private Instructor(InstructorId instructorId) {
        super(instructorId);
        subscribe(new InstructorChange(this));
    }

    public static Instructor from(InstructorId instructorId, List<DomainEvent> events){
        var instructor = new Instructor(instructorId);
        events.forEach(instructor::applyEvent);
        return instructor;
    }

    public void actualizarDatosPersonales(DatosPersonales datosPersonales){
        appendChange(new DatosPersonalesActualizados(datosPersonales)).apply();
    }

    public void actualizarEspecialidad(Especialidad especialidad){
        appendChange(new EspecialidadActualizada(especialidad)).apply();
    }

    public void agregarExamen(ExamenId examenId, Preguntas preguntas, Proyecto proyecto, Calificacion calificacion){
        Objects.requireNonNull(examenId);
        Objects.requireNonNull(preguntas);
        Objects.requireNonNull(proyecto);
        Objects.requireNonNull(calificacion);
        appendChange(new ExamenActualizado(examenId, preguntas, proyecto, calificacion)).apply();
    }

    public void editarProyectoExamen(Proyecto proyecto){
        appendChange(new ProyectoEditado(proyecto)).apply();
    }

    public void calcularCalificacionExamen(Preguntas preguntas, Calificacion calificacion){
        appendChange(new CalificacionExamenCalculada(preguntas, calificacion)).apply();
    }

    public void calcularCalificacionProyecto(Proyecto proyecto, Calificacion calificacion){
        appendChange(new CalificacionProyectoCalculada(proyecto, calificacion)).apply();
    }

    public void agregarAsesoria(AsesoriaId asesoriaId, Time duracion, Date fecha, String tema){
        Objects.requireNonNull(asesoriaId);
        Objects.requireNonNull(duracion);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(tema);
        appendChange(new AsesoriaAgregada(asesoriaId, duracion, fecha, tema)).apply();
    }

    public void asignarDuracionAsesoria(Time duracion){
        appendChange(new DuracionAsesoriaAsignada(duracion)).apply();
    }

    public void asignarFechaAsesoria(Date fecha){
        appendChange(new FechaAsesoriaAsignada(fecha)).apply();
    }

    public void asignarTemaAsesoria(String tema){
        appendChange(new TemaAsesoriaAsignado(tema)).apply();
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }

    public Especialidad Especialidad() {
        return especialidad;
    }

    public Examen Examen() {
        return examen;
    }

    public Asesoria Asesoria() {
        return asesoria;
    }
}
