package dev.javaSpring.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Sinaliza que essa classe é um controller
@RestController
// Sinaliza que esse controller vai mapear as rotas do programa
@RequestMapping
public class NinjaController {

    //Cria a rota "/boasvindas e direciona a mensagem para essa rota
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota!";
    }
}
