package com.sofka.implementacionddd.domain.estudioso;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionddd.domain.estudioso.events.EstudiosoCreado;

public class EstudiosoChange extends EventChange {

    public EstudiosoChange(Estudioso estudioso){

        apply((EstudiosoCreado event) ->
                estudioso.datosPersonales = event.datosPersonales());

    }
}
