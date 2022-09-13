package com.machado.fabiano.recruitmentvrbeneficios.dto;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;

public class CartaoDto {

    private String senha;

    private String numeroCartao;

    public CartaoDto(Cartao cartao) {
        this.senha = cartao.getSenha();
        this.numeroCartao = cartao.getNumeroCartao();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenha() {
        return senha;
    }
}