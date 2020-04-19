package leonardo.dornelles.nunes.ExemploGradelRestControllerLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leonardo Dornelles Nunes
 * @since 19/04/2020 - 20:21
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    /**
     *
     * @return retorna uma frase na index
     */
    @GetMapping("/")
    public String index() {
        return "Voce esta na index";
    }

}
