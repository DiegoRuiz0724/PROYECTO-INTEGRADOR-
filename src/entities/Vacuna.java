package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vacuna")
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVacuna;

    private String nombre;

    private int dosisRequeridas;

    public Vacuna() {
    }

    public Vacuna(String nombre, int dosisRequeridas) {
        this.nombre = nombre;
        this.dosisRequeridas = dosisRequeridas;
    }

    public Long getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Long idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDosisRequeridas() {
        return dosisRequeridas;
    }

    public void setDosisRequeridas(int dosisRequeridas) {
        this.dosisRequeridas = dosisRequeridas;
    }
}