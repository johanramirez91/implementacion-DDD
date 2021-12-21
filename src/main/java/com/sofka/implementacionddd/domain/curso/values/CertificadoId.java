package com.sofka.implementacionddd.domain.curso.values;

import co.com.sofka.domain.generic.Identity;

public class CertificadoId extends Identity {

    public CertificadoId(){

    }

    private CertificadoId(String id){
        super(id);
    }

    public static CertificadoId of(String id){
        return new CertificadoId(id);
    }
}
