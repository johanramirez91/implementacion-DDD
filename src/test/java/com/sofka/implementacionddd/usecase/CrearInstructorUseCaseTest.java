package com.sofka.implementacionddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.implementacionddd.domain.instructor.commands.CrearInstructor;
import com.sofka.implementacionddd.domain.instructor.events.InstructorCreado;
import com.sofka.implementacionddd.domain.instructor.values.DatosPersonales;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearInstructorUseCaseTest {
    private static String INSTRUCTORID = "XXXX123";

    @Test
    void crearInstructor(){
        //Arrange
        var command = new CrearInstructor(
                InstructorId.of(INSTRUCTORID),
                new DatosPersonales("Johan", "Ramirez", "johan911019@gmail.com")
        );
        var useCase = new CrearInstructorUseCase();

        //Act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(INSTRUCTORID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Asserts
        var event = (InstructorCreado) events.get(0);
        Assertions.assertEquals("Johan", event.DatosPersonales().value().nombre());
        Assertions.assertEquals("Ramirez", event.DatosPersonales().value().apellido());
    }
}