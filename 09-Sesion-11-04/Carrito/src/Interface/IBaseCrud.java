package Interface;

import java.util.List;
import java.util.Optional;

public interface IBaseCrud<T> {
    static void Load(){
        System.out.println("Cargando...");
    }
    void save();
    void update(Long id);
    void delete(Long id);
    List<T> findAll();
    Optional<T> findById(Long id);
}
