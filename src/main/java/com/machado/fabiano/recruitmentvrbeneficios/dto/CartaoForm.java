package com.machado.fabiano.recruitmentvrbeneficios.dto;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;

import java.math.BigDecimal;

public class CartaoForm {

//    @NotNull @NotEmpty @Length(min = 16, max = 16)
    private String numeroCartao;

//    @NotNull @NotEmpty @Length(min = 4, max = 4)
    private String senha;

    public Cartao converter() {
        return new Cartao(numeroCartao, senha, new BigDecimal("500"));
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenha() {
        return senha;
    }
}
