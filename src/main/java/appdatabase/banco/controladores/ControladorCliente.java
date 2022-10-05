package appdatabase.banco.controladores;

import appdatabase.banco.entidades.Cliente;
import appdatabase.banco.servicios.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ControladorCliente {
@Autowired
   private  ServicioCliente sc;


@GetMapping
    public List<Cliente> listarinformacioncliente(){
     return sc.listarclientes();
}


@PostMapping
    public Cliente insertarCliente(@RequestBody Cliente cliente){
    return  sc.guardarcliente(cliente);

}

@PutMapping
    public Cliente actualizarCliente(@RequestBody Cliente cliente){
    return  sc.actualizarclinet(cliente);
}
@DeleteMapping
    public void eliminarCliente(@RequestBody Cliente cliente){
    sc.eliminarcliente(cliente);
}
@GetMapping("/{doc}")
    public Cliente consultarpordocumento(@PathVariable("doc")int doc){
    return sc.consultarClinetPorDocumento(doc);
}

@DeleteMapping("/{doc}")
    public void eliminarPorId(@PathVariable("doc") int doc){
     sc.elimnarClinetePorID(doc);
}

@GetMapping("consulta/{nom}")
public Cliente consultarClientePorNombre(@PathVariable("nom")String nom){

    return sc.consultarPorNombre(nom);
}

}