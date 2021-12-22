package com.sofka.implementacionddd.domain.curso.commads;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;

import java.util.List;

public class AgregarEstudiosos extends Command {

    private final List<EstudiosoId> estudiosoIdList;

    public AgregarEstudiosos(List<EstudiosoId> estudiosoIdList) {
        this.estudiosoIdList = estudiosoIdList;
    }

    public List<EstudiosoId> getEstudiosoIdList() {
        return estudiosoIdList;
    }
}
