package com.sofka.implementacionddd.instructor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class Especialidad implements ValueObject<Especialidad.Props> {

    private final String experiencia;
    private final List<String> certificaciones;

    public Especialidad(String tituloUniversitario, List<String> certificaciones) {
        this.experiencia = Objects.requireNonNull(tituloUniversitario);
        this.certificaciones = Objects.requireNonNull(certificaciones);

        if (this.experiencia.isBlank()) {
            throw new IllegalArgumentException("El titulo universitario no puede estar vacío");
        }

        if (this.certificaciones.isEmpty()) {
            throw new IllegalArgumentException("Debes tener al menos una certificación");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especialidad that = (Especialidad) o;
        return Objects.equals(experiencia, that.experiencia) && Objects.equals(certificaciones, that.certificaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experiencia, certificaciones);
    }

    public Props value() {
        return new Props() {
            @Override
            public String experiencia() {
                return experiencia;
            }

            @Override
            public List<String> certificaciones() {
                return certificaciones;
            }
        };
    }

    public interface Props {
        String experiencia();

        List<String> certificaciones();
    }
}
