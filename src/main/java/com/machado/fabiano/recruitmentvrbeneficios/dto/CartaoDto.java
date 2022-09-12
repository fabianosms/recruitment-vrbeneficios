package com.machado.fabiano.recruitmentvrbeneficios.dto;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;

public class CartaoDto {

    private String senha;

    private String numeroCartao;

    public CartaoDto(Cartao card) {
        this.senha = card.getSenha();
        this.numeroCartao = card.getNumeroCartao();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenha() {
        return senha;
    }
}
