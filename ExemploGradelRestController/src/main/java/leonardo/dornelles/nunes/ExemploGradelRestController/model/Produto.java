package leonardo.dornelles.nunes.ExemploGradelRestController.model;

/**
 * @author Leonardo Dornelles Nunes
 * @since 19/04/2020 - 17:32
 * @version 1.0
 */
public class Produto {

    private String descricao;
    private String nomeProduto;

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", nomeProduto='" + nomeProduto + '\'' +
                '}';
    }
}
