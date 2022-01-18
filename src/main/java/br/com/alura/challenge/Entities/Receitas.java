package br.com.alura.challenge.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Table(name = "receitas")
public class Receitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String descricao;

    @NotNull
    @Column(unique = true)
    private Double valor;

    @NotNull
    private LocalDateTime data = LocalDateTime.now();


    public Receitas(@NotNull @NotBlank String descricao, @NotNull @NotBlank Double valor) {
        super();
        this.descricao = descricao;
        this.valor = valor;
    }

    public Receitas() {

    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Receitas{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
