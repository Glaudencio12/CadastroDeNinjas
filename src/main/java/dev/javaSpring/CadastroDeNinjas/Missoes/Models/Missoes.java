package dev.javaSpring.CadastroDeNinjas.Missoes.Models;

import dev.javaSpring.CadastroDeNinjas.Ninjas.Models.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class Missoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeMissao;
    private String dificuldade;
    // @OneToMany - uma missão tem muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private Ninja ninja;

    public Missoes(String nomeMissao, String dificuldade) {
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
    }

    public Missoes(){}

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
