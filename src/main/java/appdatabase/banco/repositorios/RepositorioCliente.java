package appdatabase.banco.repositorios;

import appdatabase.banco.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.event.CaretListener;
@Repository
public interface RepositorioCliente extends JpaRepository<Cliente,Integer> {
       Cliente findByNombre(String Cliente);
     //  @Query()


}
