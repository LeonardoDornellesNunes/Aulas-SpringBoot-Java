package leonardo.dornelles.nunes.ExemploGradelRestController.controller;

import leonardo.dornelles.nunes.ExemploGradelRestController.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leonardo Dornelles Nunes
 * @since 19/04/2020 - 17:39
 * @version 1.0
 */
@RestController
public class ProdutoController {

    /**
     *
     * @return retorna uma frase com a area onde esta
     */
    @GetMapping("/produto")
    public String getProduto() {
        return "Area dos produtos";
    }

    /**
     *
     * @return retorna o toString contido na classe produto
     */
    @GetMapping("/produtos")
    public Produto getProdutos() {
        Produto produto = new Produto();
        produto.setNomeProduto("Batatinha Chips");
        produto.setDescricao("Batatinha chips sabor queijo");
        return produto;
    }
}
