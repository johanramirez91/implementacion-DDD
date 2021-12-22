package com.sofka.implementacionddd.domain.curso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionddd.domain.curso.events.*;
import com.sofka.implementacionddd.domain.curso.values.CertificadoId;
import com.sofka.implementacionddd.domain.curso.values.CursoId;
import com.sofka.implementacionddd.domain.curso.values.VideoId;
import com.sofka.implementacionddd.domain.estudioso.values.DatosPersonales;
import com.sofka.implementacionddd.domain.estudioso.values.EstudiosoId;
import com.sofka.implementacionddd.domain.estudioso.values.Puntaje;
import com.sofka.implementacionddd.domain.instructor.values.Calificacion;
import com.sofka.implementacionddd.domain.instructor.values.InstructorId;

import java.sql.Time;
import java.util.List;

public class Curso extends AggregateEvent<CursoId> {
    protected Video video;
    protected Certificado certificado;
    protected Calificacion calificacion;
    protected Puntaje puntaje;
    protected Integer progreso;
    protected InstructorId instructorId;
    protected List<EstudiosoId> estudiosoIdList;

    public Curso(CursoId cursoId, Video video,
                 Certificado certificado, Calificacion calificacion,
                 Puntaje puntaje, Integer progreso, InstructorId instructorId,
                 List<EstudiosoId> estudiosoIdList) {

        super(cursoId);
        this.video = video;
        this.certificado = certificado;
        this.calificacion = calificacion;
        this.puntaje = puntaje;
        this.progreso = progreso;
        this.instructorId = instructorId;
        this.estudiosoIdList = estudiosoIdList;
    }

    public Curso(CursoId cursoId) {
        super(cursoId);
        subscribe(new CursoChange(this));
    }

    public static Curso from(CursoId cursoId, List<DomainEvent> events){
        var curso = new Curso(cursoId);
        events.forEach(curso::applyEvent);
        return curso;
    }

    public void actualizarCalificacionCurso(Calificacion calificacion, EstudiosoId estudiosoId){
        appendChange(new CalificacionCursoActualizada(calificacion, estudiosoId)).apply();
    }

    public void  actualizarProgesoCurso(Estado estado){
        appendChange(new EstadoCursoDefinido(estado)).apply();
    }

    public void agregarEstudiosos(EstudiosoId estudiosoId){
        appendChange(new EstudiosoAgregado(estudiosoId)).apply();
    }

    public void agregarInstructor(InstructorId instructorId){
        appendChange(new InstructorAgregado(instructorId)).apply();
    }

    public void definirEstadoCurso(Estado estado){
        appendChange(new EstadoCursoDefinido(estado)).apply();
    }

    public void generarCertificado(CertificadoId certificadoId, EstudiosoId estudiosoId, DatosPersonales datosPersonales){
        appendChange(new CertificadoGenerado(certificadoId, estudiosoId, datosPersonales)).apply();
    }

    public void definirDuracionVideo(VideoId videoId, Time duracion){
        appendChange(new DuracionVideoDefinida(videoId, duracion)).apply();
    }

    public void actualizarDatosPersonalesCertificado(EstudiosoId estudiosoId, DatosPersonales datosPersonales){
        appendChange(new DatosPersonalesCertificadoActualizados(datosPersonales, estudiosoId)).apply();
    }

    public Video Video() {
        return video;
    }

    public Certificado Certificado() {
        return certificado;
    }

    public Calificacion Calificacion() {
        return calificacion;
    }

    public Puntaje Puntaje() {
        return puntaje;
    }

    public Integer Progreso() {
        return progreso;
    }

    public InstructorId InstructorId() {
        return instructorId;
    }

    public List<EstudiosoId> EstudiosoIdList() {
        return estudiosoIdList;
    }
}
