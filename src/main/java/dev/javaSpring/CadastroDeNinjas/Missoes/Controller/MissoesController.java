package dev.javaSpring.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {
    @GetMapping("/boasvindas2")
    public String boasVindas2(){
        return "Bem vindo às missões";
    }
}
