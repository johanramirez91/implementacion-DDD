package com.sofka.implementacionddd.domain.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class Vigencia implements ValueObject<Vigencia.Props> {

    private final Date fechaInicio;
    private final Integer vigenciaAnios;

    public Vigencia(Date fechaInicio, Integer vigenciaAnios) {
        this.fechaInicio = Objects.requireNonNull(fechaInicio);
        this.vigenciaAnios = Objects.requireNonNull(vigenciaAnios);

        if (this.vigenciaAnios == 0) {
            throw new IllegalArgumentException("La vigencia debe se mayor a 0");
        }

        if (this.fechaInicio.after(new Date(Instant.now().toEpochMilli()))) {
            throw new IllegalArgumentException("No es posible colocar una fecha del futuro");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vigencia vigencia = (Vigencia) o;
        return Objects.equals(fechaInicio, vigencia.fechaInicio) && Objects.equals(vigenciaAnios, vigencia.vigenciaAnios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInicio, vigenciaAnios);
    }

    public Props value() {
        return new Props() {
            @Override
            public Date fechaInicio() {
                return fechaInicio;
            }

            @Override
            public Integer vigenciaAnios() {
                return vigenciaAnios;
            }
        };
    }

    public interface Props {
        Date fechaInicio();

        Integer vigenciaAnios();
    }
}
