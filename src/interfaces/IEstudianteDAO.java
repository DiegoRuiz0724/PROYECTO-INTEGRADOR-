public interface IEstudianteDAO {
    void guardarEstudiante(Estudiante estudiante);

    void actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Long id);
    Estudiante BuscarPorId  (Long id);
    List<Estudiante> listarEstudiantes();

}
