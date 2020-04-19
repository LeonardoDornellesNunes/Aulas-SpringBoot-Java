package leonardo.dornelles.nunes.ExemploGradelRestController.controller;

import leonardo.dornelles.nunes.ExemploGradelRestController.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenardo Dornelles Nunes
 * @since 19/04/2020 - 17:14
 * @version 1.0
 */
@RestController
public class ClienteController {

    /**
     *
     * @return retorna uma frase com a area onde esta
     */
    @GetMapping("/cliente")
    public String getCliente() {
        return "Area dos clientes";
    }

    /**
     *
     * @return retorna o toString contido na classe cliente
     */
    @GetMapping("/clientes")
    public Cliente getClientes() {
        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        return cliente;
    }
}
