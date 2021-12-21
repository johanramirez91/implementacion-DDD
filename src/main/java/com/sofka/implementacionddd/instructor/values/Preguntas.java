package com.sofka.implementacionddd.instructor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;


public class Preguntas implements ValueObject<Preguntas.Props> {

    private final String enunciado;
    private final List<String> opciones;
    private final Calificacion calificacion;

    public Preguntas(String enunciado, List<String> opciones, Calificacion calificacion) {
        this.enunciado = Objects.requireNonNull(enunciado);
        this.opciones = Objects.requireNonNull(opciones);
        this.calificacion = Objects.requireNonNull(calificacion);

        if (this.enunciado.isBlank()) {
            throw new IllegalArgumentException("El enunciado no puede estar vacio");
        }

        if (this.opciones.isEmpty()) {
            throw new IllegalArgumentException("Deben haber al menos 2 opciones");
        }

        if (this.opciones.size() < 2) {
            throw new IllegalArgumentException("Deben haber al menos 2 opciones");
        }

    }

    public Props value() {
        return new Props() {
            @Override
            public String enunciado() {
                return enunciado;
            }

            @Override
            public List opciones() {
                return opciones;
            }

            @Override
            public Calificacion calificacion() {
                return calificacion;
            }
        };
    }

    public interface Props {
        String enunciado();

        List opciones();

        Calificacion calificacion();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preguntas preguntas = (Preguntas) o;
        return Objects.equals(enunciado, preguntas.enunciado) && Objects.equals(opciones, preguntas.opciones) && Objects.equals(calificacion, preguntas.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado, opciones, calificacion);
    }
}
