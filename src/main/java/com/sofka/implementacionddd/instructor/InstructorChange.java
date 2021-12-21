package com.sofka.implementacionddd.instructor;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionddd.instructor.events.*;

public class InstructorChange extends EventChange {

    public InstructorChange(Instructor instructor) {

        apply((InstructorCreado event) ->
                instructor.datosPersonales = event.DatosPersonales()
        );

        apply((DatosPersonalesActualizados event) ->
                instructor.datosPersonales = event.getDatosPersonales()
        );

        apply((EspecialidadActualizada event) ->
                instructor.especialidad = event.getEspecialidad()
        );

        apply((ExamenActualizado event) ->
            instructor.examen = new Examen(
                    event.getExamenId(),
                    event.getProyecto(),
                    event.getCalificacion(),
                    event.getPreguntas())
        );

        apply((CalificacionExamenCalculada event) ->
            instructor.calcularCalificacionExamen(event.getPreguntas(), event.getCalificacion())
        );

        apply((CalificacionProyectoCalculada event) ->
            instructor.calcularCalificacionProyecto(event.getProyecto(), event.getCalificacion())
        );

        apply((EspacioAsesoriaAbierto event) ->
            instructor.asesoria = new Asesoria(
                    event.getAsesoriaId(),
                    event.getDuracion(),
                    event.getFecha(),
                    event.getTema()
            )
        );

        apply((ProyectoEditado event) ->
            instructor.editarProyectoExamen(event.getProyecto())
        );

        apply((DuracionAsesoriaAsignada event) ->
            instructor.asignarDuracionAsesoria(event.getDuracion())
        );

        apply((FechaAsesoriaAsignada event) ->
            instructor.asignarFechaAsesoria(event.getFecha())
        );

        apply((TemaAsesoriaAsignado event) ->
            instructor.asignarTemaAsesoria(event.getTema())
        );
    }
}
