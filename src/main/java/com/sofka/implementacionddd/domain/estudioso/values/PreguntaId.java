package com.sofka.implementacionddd.domain.estudioso.values;

import co.com.sofka.domain.generic.Identity;

public class PreguntaId extends Identity {

    public PreguntaId(){

    }

    private PreguntaId(String id){
        super(id);
    }

    public static PreguntaId of(String id){
        return new PreguntaId(id);
    }
}
