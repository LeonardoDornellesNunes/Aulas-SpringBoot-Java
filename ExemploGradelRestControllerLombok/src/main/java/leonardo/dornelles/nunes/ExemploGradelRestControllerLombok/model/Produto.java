package leonardo.dornelles.nunes.ExemploGradelRestControllerLombok.model;

import lombok.*;

/**
 * @author Leonardo Dornelles Nunes
 * @since 19/04/2020 - 19:50
 * @version 1.0
 */
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Produto {

    private String nome;

    private String descricao;
}
