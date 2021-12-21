package com.sofka.implementacionddd.domain.estudioso;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionddd.domain.estudioso.values.AporteId;
import com.sofka.implementacionddd.domain.estudioso.values.Descripcion;

import java.util.Objects;

public class Aporte extends Entity<AporteId> {

    private Descripcion descripcion;

    public Aporte(AporteId aporteId) {
        super(aporteId);
        this.descripcion = descripcion;
    }

    public void asignarLimiteCaracteres(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public void escribirAporteVideo(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

}
