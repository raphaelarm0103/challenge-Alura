package br.com.alura.challenge.Request;

import br.com.alura.challenge.Entities.Receitas;

public class ReceitaDetalhe {

    private final String descricao;

    private final Double valor;

    public ReceitaDetalhe(Receitas receitas){
        descricao = receitas.getDescricao();
        valor = receitas.getValor();
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
