package br.com.alura.challenge.Request;

import br.com.alura.challenge.Entities.Receitas;

public class ReceitasRequest {

    private final String descricao;

    private final Double valor;

    public ReceitasRequest(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Receitas toModel(){
        return new Receitas(this.descricao, this.valor);
    }
}
