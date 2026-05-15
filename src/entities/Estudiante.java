package entities;

import jakarta.persistence.*;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;

    private String nombres;
    private String apellidos;
    private String documento;
    private int semestre;

    private LocalDate fechaInduccion;
    private LocalDate arlVencimiento;

    @ManyToOne
    @JoinColumn(name = "id_programa")
    private Programa programa;

    public Estudiante() {
    }

    public Estudiante(String nombres,
                      String apellidos,
                      String documento,
                      int semestre,
                      LocalDate fechaInduccion,
                      LocalDate arlVencimiento,
                      Programa programa) {

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.semestre = semestre;
        this.fechaInduccion = fechaInduccion;
        this.arlVencimiento = arlVencimiento;
        this.programa = programa;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public LocalDate getFechaInduccion() {
        return fechaInduccion;
    }

    public void setFechaInduccion(LocalDate fechaInduccion) {
        this.fechaInduccion = fechaInduccion;
    }

    public LocalDate getArlVencimiento() {
        return arlVencimiento;
    }

    public void setArlVencimiento(LocalDate arlVencimiento) {
        this.arlVencimiento = arlVencimiento;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
}