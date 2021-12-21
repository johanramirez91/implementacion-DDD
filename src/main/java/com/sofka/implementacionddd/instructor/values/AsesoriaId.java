package com.sofka.implementacionddd.instructor.values;

import co.com.sofka.domain.generic.Identity;

public class AsesoriaId extends Identity {

    public AsesoriaId() {
    }

    private AsesoriaId(String id) {
        super(id);
    }

    public static AsesoriaId of(String id) {
        return new AsesoriaId(id);
    }
}
