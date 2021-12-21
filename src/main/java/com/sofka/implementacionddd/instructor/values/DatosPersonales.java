package com.sofka.implementacionddd.instructor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<DatosPersonales.Props> {

    private final String nombre;
    private final String apellido;
    private final String email;

    public DatosPersonales(String nombre, String apellido, String email){
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.email = Objects.requireNonNull(email);

        if (this.email.isBlank()){
            throw new IllegalArgumentException("El email no puede estar vacio");
        }

        if (!this.email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")){
            throw new IllegalArgumentException("Email no valido");
        }

        if (this.nombre.length() < 4 ){
            throw new IllegalArgumentException("El nombre debe tener al menos 4 caracteres");
        }
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

            @Override
            public String email() {
                return null;
            }
        };
    }

    public interface Props {
        String nombre();

        String apellido();

        String email();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosPersonales that = (DatosPersonales) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email);
    }
}
