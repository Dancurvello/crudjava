package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Quando uma classe for entidade na modelagem de dados
public class Pessoa {

    // Criando os atributos dessa classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;

    //Criando os constructors do objeto
    public Pessoa (String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    //Criando os getters and setters dos atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
