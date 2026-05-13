package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tutor_clinico")
public class TutorClinico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTutor;

    private String nombres;

    @Enumerated(EnumType.STRING)
    private TipoTutor tipoTutor;

    public TutorClinico() {
    }

    public TutorClinico(String nombres,
                        TipoTutor tipoTutor) {

        this.nombres = nombres;
        this.tipoTutor = tipoTutor;
    }

    public Long getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Long idTutor) {
        this.idTutor = idTutor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public TipoTutor getTipoTutor() {
        return tipoTutor;
    }

    public void setTipoTutor(TipoTutor tipoTutor) {
        this.tipoTutor = tipoTutor;
    }
}