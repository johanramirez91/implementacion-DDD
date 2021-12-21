package com.sofka.implementacionddd.domain.estudioso.values;

import co.com.sofka.domain.generic.Identity;

public class EstudiosoId extends Identity {

    public EstudiosoId() {

    }

    private EstudiosoId(String id) {
        super(id);
    }

    public static EstudiosoId of(String id) {
        return new EstudiosoId(id);
    }

}
