package com.sofka.implementacionddd.domain.estudioso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Puntaje implements ValueObject<Integer> {
    private Integer puntaje;

    public Puntaje(Integer puntaje) {
        this.puntaje = Objects.requireNonNull(puntaje, "El puntaje no puede ser nulo");

        if (this.puntaje < 0){
            throw new IllegalArgumentException("No puede haber un puntaje menor que 0");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntaje puntaje1 = (Puntaje) o;
        return Objects.equals(puntaje, puntaje1.puntaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puntaje);
    }

    @Override
    public Integer value() {
        return puntaje;
    }
}
