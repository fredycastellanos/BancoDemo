package appdatabase.banco.servicios;

import appdatabase.banco.entidades.Cliente;
import appdatabase.banco.repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCliente {
    @Autowired
    private RepositorioCliente rc;
    public List<Cliente> listarclientes(){

        return  rc.findAll();
    }

    public Cliente guardarcliente(Cliente cliente){
        return rc.save(cliente);
    }

    public Cliente actualizarclinet(Cliente cliente){
        return  rc.save(cliente);
    }

    public void eliminarcliente(Cliente cliente){
         rc.delete(cliente);
    }

    public Cliente consultarClinetPorDocumento(Integer doc){

        return  rc.findById(doc).get();

    }

    public void elimnarClinetePorID(Integer doc){

        rc.deleteById(doc);
    }

    public Cliente consultarPorNombre(String nom){

        return  rc.findByNombre(nom);
    }

}
