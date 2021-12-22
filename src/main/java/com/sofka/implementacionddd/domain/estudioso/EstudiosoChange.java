package com.sofka.implementacionddd.domain.estudioso;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionddd.domain.estudioso.events.*;

public class EstudiosoChange extends EventChange {

    public EstudiosoChange(Estudioso estudioso){

        apply((EstudiosoCreado event) ->
                estudioso.datosPersonales = event.datosPersonales());

        apply((DatosPersonalesActualizados event) ->
                estudioso.datosPersonales = event.getDatosPersonales());

        apply((AsesoriaSolicitada event) ->
                estudioso.solicitarAsesoria(event.getAsesoriaId()));

        apply((CursoAsignado event) ->
                estudioso.asignarCurso(event.getCurso()));

        apply((PreguntaAgregada event) ->
                estudioso.agregarPregunta(event.getPreguntaId(), event.getDescripcion()));

        apply((AporteAgregado event) ->
                estudioso.agregarAporte(event.getAporteId(), event.getDescripcion()));

        apply((PuntosActualizados event) ->
                estudioso.actualizarPuntos(event.getPuntaje()));
    }
}
