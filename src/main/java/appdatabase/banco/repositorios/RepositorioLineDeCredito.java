package appdatabase.banco.repositorios;

import appdatabase.banco.entidades.LineaDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLineDeCredito extends JpaRepository<LineaDeCredito,Integer> {
}
