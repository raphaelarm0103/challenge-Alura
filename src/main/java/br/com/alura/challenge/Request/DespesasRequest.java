package br.com.alura.challenge.Request;

import br.com.alura.challenge.Entities.Despesas;


public class DespesasRequest {

    private String descricao;

    private Double valor;

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }


    public DespesasRequest(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Despesas toModel(){
        return new Despesas(
        this.descricao,
        this.valor);
    }

}
