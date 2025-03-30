package dev.javaSpring.CadastroDeNinjas.Missoes.Models;

import dev.javaSpring.CadastroDeNinjas.Ninjas.Models.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_missoes")
public class Missoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeMissao;
    private String dificuldade;
    @OneToMany(mappedBy = "missoes") // @OneToMany - Uma missão tem muitos ninjas
    private Ninja ninja;
}
