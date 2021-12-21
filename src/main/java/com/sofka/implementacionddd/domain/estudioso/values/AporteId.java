package com.sofka.implementacionddd.domain.estudioso.values;

import co.com.sofka.domain.generic.Identity;

public class AporteId extends Identity {

    public AporteId() {

    }

    private AporteId(String id) {
        super(id);
    }

    public static AporteId of(String id) {
        return new AporteId(id);
    }
}
