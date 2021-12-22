package com.sofka.implementacionddd.domain.estudioso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.values.CursoId;
import com.sofka.implementacionddd.domain.estudioso.events.*;
import com.sofka.implementacionddd.domain.estudioso.values.*;
import com.sofka.implementacionddd.domain.instructor.values.AsesoriaId;

import java.util.List;
import java.util.Objects;

public class Estudioso extends AggregateEvent<EstudiosoId> {

    protected DatosPersonales datosPersonales;
    protected Aporte aporte;
    protected Pregunta pregunta;
    protected int puntaje;

    public Estudioso(EstudiosoId estudiosoId, DatosPersonales datosPersonales){
        super(estudiosoId);
        appendChange(new EstudiosoCreado(datosPersonales)).apply();
    }

    private Estudioso(EstudiosoId estudiosoId){
        super(estudiosoId);
        subscribe(new EstudiosoChange(this));
    }

    public static Estudioso from(EstudiosoId estudiosoId, List<DomainEvent> events){
        var estudioso = new Estudioso(estudiosoId);
        events.forEach(estudioso::applyEvent);
        return estudioso;
    }

    public void actualizarDatosPersonales(DatosPersonales datosPersonales){
        appendChange(new DatosPersonalesActualizados(datosPersonales)).apply();
    }

    public void actualizarPuntos(Puntaje puntaje){
        appendChange(new PuntosActualizados(puntaje)).apply();
    }

    public void agregarAporte(AporteId aporteId, Descripcion descripcion){
        Objects.requireNonNull(aporteId);
        Objects.requireNonNull(descripcion);
        appendChange(new AporteAgregado(aporteId, descripcion)).apply();
    }

    public void agregarPregunta(PreguntaId preguntaId, Descripcion descripcion){
        Objects.requireNonNull(preguntaId);
        Objects.requireNonNull(descripcion);
        appendChange(new PreguntaAgregada(preguntaId, descripcion)).apply();
    }

    public void asignarCurso(CursoId cursoId){
        appendChange(new CursoAsignado(cursoId)).apply();
    }

    public void solicitarAsesoria(AsesoriaId asesoriaId){
        Objects.requireNonNull(asesoriaId);
        appendChange(new AsesoriaSolicitada(asesoriaId)).apply();
    }

    public DatosPersonales DatosPersonales() {
        return datosPersonales;
    }

    public Aporte Aporte() {
        return aporte;
    }

    public Pregunta Pregunta() {
        return pregunta;
    }

    public int Puntaje() {
        return puntaje;
    }
}
