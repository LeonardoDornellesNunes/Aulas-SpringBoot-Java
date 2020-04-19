package leonardo.dornelles.nunes.ExemploGradelRestControllerLombok.controller;

import leonardo.dornelles.nunes.ExemploGradelRestControllerLombok.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leonardo Dornelles Nunes
 * @since 19/04/2020 - 20:30
 * @version 1.0
 */
@RestController
public class ClienteController {

    /**
     *
     * @return retorna o ToString do cliente
     */
    @GetMapping("/clientes")
    public Cliente getCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cristian");
        cliente.setSobrenome("Silva");
        cliente.setEmail("cristianSilva@hotmail.com");
        return cliente;
    }

}
