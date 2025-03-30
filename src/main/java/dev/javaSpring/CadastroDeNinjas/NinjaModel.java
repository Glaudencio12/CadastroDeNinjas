package dev.javaSpring.CadastroDeNinjas;

import jakarta.persistence.*;

// Transforma a classe em uma entidade(Tabela) do banco de dados atravé da dependência SpringJPA
@Entity
// Nomeia a tabela no BD
@Table(name = "tb_cadastro")
public class NinjaModel {
    // Fala pro java que é um ID
    @Id
    // Gera valores automaticamente para o Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel()
    {}

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
