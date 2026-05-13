package entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vacuna_estudiante")
public class VacunaEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVacunaEstudiante;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_vacuna")
    private Vacuna vacuna;

    private int numeroDosis;

    private LocalDate fechaAplicacion;

    @Enumerated(EnumType.STRING)
    private EstadoVacuna estadoVacuna;

    public VacunaEstudiante() {
    }

    public VacunaEstudiante(Estudiante estudiante,
                            Vacuna vacuna,
                            int numeroDosis,
                            LocalDate fechaAplicacion,
                            EstadoVacuna estadoVacuna) {

        this.estudiante = estudiante;
        this.vacuna = vacuna;
        this.numeroDosis = numeroDosis;
        this.fechaAplicacion = fechaAplicacion;
        this.estadoVacuna = estadoVacuna;
    }

    public Long getIdVacunaEstudiante() {
        return idVacunaEstudiante;
    }

    public void setIdVacunaEstudiante(Long idVacunaEstudiante) {
        this.idVacunaEstudiante = idVacunaEstudiante;
    }
}