package com.sofka.implementacionddd.domain.estudioso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    protected String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);

        if (this.descripcion.isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacia");
        }

        if (this.descripcion.length() < 20){
            throw new IllegalArgumentException("La descripción debe tener al menos 20 caractéres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }

    @Override
    public String value() {
        return descripcion;
    }
}
