package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "area_medica")
public class AreaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArea;

    private String nombre;

    public AreaMedica() {
    }

    public AreaMedica(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
