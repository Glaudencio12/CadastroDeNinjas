package dev.javaSpring.CadastroDeNinjas.Ninjas.Models;
import dev.javaSpring.CadastroDeNinjas.Missoes.Models.Missoes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Transforma a classe em uma entidade(Tabela) do banco de dados através da dependência SpringJPA
@Table(name = "tb_cadastro") // Nomeia a tabela no BD
@NoArgsConstructor // Cria um construtor sem argumentos através da dependência Lombok
@AllArgsConstructor // Cria um construtor com argumentos através da dependência Lombok
@Data // Implementa os getters e setters através da dependência Lombok
public class Ninja {
    @Id // Sinaliza para o java que o campo id é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera valores automaticamente para o Id
    private long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne  // @ManyToOne - Um ninja tem uma única missão
    @JoinColumn(name = "missoes_id")  // Foreign Key - Chave estrangeira
    private Missoes missoes;
}
