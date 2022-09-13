package com.machado.fabiano.recruitmentvrbeneficios.dto;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;

import java.math.BigDecimal;

public class TransacaoForm {

    private String numeroCartao;

    private String senhaCartao;

    private BigDecimal valor;

    public Cartao converter() {
        return new Cartao(numeroCartao, senhaCartao);
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenhaCartao() {
        return senhaCartao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}