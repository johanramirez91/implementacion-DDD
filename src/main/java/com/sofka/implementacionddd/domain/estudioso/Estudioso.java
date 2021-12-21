package com.sofka.implementacionddd.domain.estudioso;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionddd.domain.estudioso.events.EstudiosoCreado;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

public class Estudioso extends AggregateEvent<EstudiosoId> {

    protected DatosPersonales datosPersonales;
    protected Aporte aporte;
    protected Pregunta pregunta;
    protected int puntaje;


}
