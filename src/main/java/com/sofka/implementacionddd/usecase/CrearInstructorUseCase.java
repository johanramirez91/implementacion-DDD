package com.sofka.implementacionddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.implementacionddd.domain.instructor.Instructor;
import com.sofka.implementacionddd.domain.instructor.commands.CrearInstructor;

public class CrearInstructorUseCase extends UseCase<RequestCommand<CrearInstructor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearInstructor> crearInstructorRequestCommand) {
        var command = crearInstructorRequestCommand.getCommand();
        var instructor = new Instructor(
                command.getInstructorId(),
                command.getDatosPersonales()
        );
        emit().onResponse(new ResponseEvents(instructor.getUncommittedChanges()));
    }
}
