package com.sofka.implementacionddd.domain.curso;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionddd.domain.curso.events.CalificacionCursoActualizada;


public class CursoChange extends EventChange {

    public CursoChange(Curso curso){

        apply((CalificacionCursoActualizada event) ->
                curso.actualizarCalificacionCurso(event.getCalificacion(), event.getEstudiosoId()));

    }

}
