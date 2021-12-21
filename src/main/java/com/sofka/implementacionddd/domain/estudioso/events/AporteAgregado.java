package com.sofka.implementacionddd.domain.estudioso.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.estudioso.values.AporteId;
import com.sofka.implementacionddd.domain.estudioso.values.Descripcion;

public class AporteAgregado extends DomainEvent {

    private final AporteId aporteId;
    private final Descripcion descripcion;

    public AporteAgregado(AporteId aporteId, Descripcion descripcion){
        super("sofka.implementacionddd.estudioso.aporteagregado");
        this.aporteId = aporteId;
        this.descripcion = descripcion;
    }

    public AporteId getAporteId() {
        return aporteId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
