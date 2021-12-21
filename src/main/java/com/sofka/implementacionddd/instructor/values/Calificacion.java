package com.sofka.implementacionddd.instructor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calificacion implements ValueObject<Calificacion.Props> {
    private final Integer porcentaje;
    private final Double nota;

    public Calificacion(Integer porcentaje, Double nota) {
        this.porcentaje = Objects.requireNonNull(porcentaje);
        this.nota = Objects.requireNonNull(nota);

        if (this.porcentaje > 100) {
            throw new IllegalArgumentException("No puede existir un porcentaje mayor a 100");
        }

        if (isBetween0And5()) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        }
    }

    private boolean isBetween0And5() {
        return this.nota < 0 && this.nota > 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calificacion that = (Calificacion) o;
        return Objects.equals(porcentaje, that.porcentaje) && Objects.equals(nota, that.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(porcentaje, nota);
    }

    public Props value() {
        return new Props() {
            @Override
            public Integer porcentaje() {
                return porcentaje;
            }

            @Override
            public Double nota() {
                return nota;
            }
        };
    }

    public interface Props {
        Integer porcentaje();

        Double nota();
    }
}
