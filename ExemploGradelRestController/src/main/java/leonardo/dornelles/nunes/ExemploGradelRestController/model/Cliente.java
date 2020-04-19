package leonardo.dornelles.nunes.ExemploGradelRestController.model;

/**
 *
 * @author Lenardo Dornelles Nunes
 * @since 19/04/2020 - 17:17
 * @version 1.0
 */
public class Cliente {

    private String nome;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
