import javax.persistence.Entity;
import javax.persistence.Table;

public class Estudiante {

    @Entity
    @Table(name = " estudiante")
    public class Estudiante {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEstudiante;
        private String nombre;
        private String apellido;
        private String documento;
        private int semestre;
        private boolean induccion;

        @manyToOne
        @joinColumn(name = "id:programa")
        private Programa Programa;
        @oneToMany(mappedBy = "estudiante")
        private List<RegistroIngreso> registos;

        
    }

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String documento, int semestre, boolean induccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.semestre = semestre;
        this.induccion = induccion;
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

    public boolean isInduccion() {
        return induccion;
    }

    public void setInduccion(boolean induccion) {
        this.induccion = induccion;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public List<RegistroIngreso> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroIngreso> registros) {
        this.registros = registros;
    }
}
