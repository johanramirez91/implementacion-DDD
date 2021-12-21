package com.sofka.implementacionddd.instructor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class Proyecto implements ValueObject<Proyecto.Props> {

    private final String titulo;
    private final String descripcion;
    private final Calificacion calificacion;

    public Proyecto(String titulo, String descripcion, Calificacion calificacion) {
        this.titulo = Objects.requireNonNull(titulo);
        this.descripcion = Objects.requireNonNull(descripcion);
        this.calificacion = Objects.requireNonNull(calificacion);

        if (this.titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }

        if (this.descripcion.isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacia");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyecto proyecto = (Proyecto) o;
        return Objects.equals(titulo, proyecto.titulo) && Objects.equals(descripcion, proyecto.descripcion) && Objects.equals(calificacion, proyecto.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descripcion, calificacion);
    }

    public Props value() {
        return new Props() {
            @Override
            public String titulo() {
                return titulo;
            }

            @Override
            public String descripcion(){
                return descripcion;
            }

            @Override
            public Calificacion calificacion(){
                return calificacion;
            }

        };
    }

    public interface Props {
        String titulo();

        String descripcion();

        Calificacion calificacion();
    }
}
