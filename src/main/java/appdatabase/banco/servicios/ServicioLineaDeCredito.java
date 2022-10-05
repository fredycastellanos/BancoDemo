package appdatabase.banco.servicios;

import appdatabase.banco.entidades.Cliente;
import appdatabase.banco.entidades.LineaDeCredito;
import appdatabase.banco.repositorios.RepositorioCliente;
import appdatabase.banco.repositorios.RepositorioLineDeCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioLineaDeCredito {
  @Autowired
  private RepositorioLineDeCredito  lc;

  public List<LineaDeCredito> listarClientes(){

    return (List<LineaDeCredito>) lc.findAll();

  }

  public LineaDeCredito guardarlineacredito(LineaDeCredito linea){

    return lc.save(linea);
  }

  public LineaDeCredito actualizarlineacredito(LineaDeCredito linea){

    return  lc.save(linea);
  }

   public void eliminarlineacredito(LineaDeCredito linea){
    lc.delete(linea);
  }

}
