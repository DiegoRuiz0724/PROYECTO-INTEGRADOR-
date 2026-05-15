import java.util.List;

public interface IDocumentoDAO {
    void guardar(Documento documento);
    List<Documento> lisar();

}
