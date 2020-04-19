package leonardo.dornelles.nunes.ExemploGradelRestControllerLombok.controller;

import leonardo.dornelles.nunes.ExemploGradelRestControllerLombok.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leoanrdo Dornelles Nunes
 * @since 19/04/2020 - 20:41
 * @version 1.0
 */
@RestController
public class ProdutoController {

    /**
     *
     * @return retorna o ToString de produto
     */
    @GetMapping("/produto")
    public Produto getProduto() {
        Produto produto = new Produto();
        produto.setNome("Nuggets");
        produto.setDescricao("Nuggets de queijo");
        return produto;
    }

}
