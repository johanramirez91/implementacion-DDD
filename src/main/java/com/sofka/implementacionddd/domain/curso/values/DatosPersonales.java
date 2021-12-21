package com.sofka.implementacionddd.domain.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<DatosPersonales.Props> {
    private final String nombre;
    private final String apellido;

    public DatosPersonales(String nombre, String apellido){
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);

        if (this.nombre.length() < 4 ){
            throw new IllegalArgumentException("El nombre debe tener al menos 4 caracteres");
        }

        if (this.apellido.length() < 4 ){
            throw new IllegalArgumentException("El apellido debe tener al menos 4 caracteres");
        }

        if (isBlankValue()){
            throw new IllegalArgumentException("El nombre y apellido no pueden estar vacios");
        }
    }

    private boolean isBlankValue() {
        return this.nombre.isBlank() || this.apellido.isBlank();
    }

    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Props {
        String nombre();

        String apellido();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosPersonales that = (DatosPersonales) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
