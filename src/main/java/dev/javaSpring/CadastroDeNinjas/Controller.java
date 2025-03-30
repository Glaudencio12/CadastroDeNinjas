package dev.javaSpring.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Sinaliza que essa classe é um controller
@RequestMapping // Sinaliza que esse controller vai mapear as rotas do programa
public class Controller {

    @GetMapping("/boasvindas") //Cria a rota "/boasvindas e direciona a mensagem para essa rota
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota!";
    }
}
