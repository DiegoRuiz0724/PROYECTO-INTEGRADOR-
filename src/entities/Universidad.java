 package entities;

 import java.util.List;

 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.OneToMany;
 import javax.persistence.Table;

 @Entity
 @Table(name = "universidad")
 public class Universidad {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idUniversidad;

     private String nombre;

     @OneToMany(mappedBy = "universidad")
     private List<Programa> programas;

     public Universidad() {
     }

     public Universidad(String nombre) {
         this.nombre = nombre;
     }

     public Long getIdUniversidad() {
         return idUniversidad;
     }

     public void setIdUniversidad(Long idUniversidad) {
         this.idUniversidad = idUniversidad;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public List<Programa> getProgramas() {
         return programas;
     }

     public void setProgramas(List<Programa> programas) {
         this.programas = programas;
     }
 }