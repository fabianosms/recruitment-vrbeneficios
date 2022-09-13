package com.machado.fabiano.recruitmentvrbeneficios.dto;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CartaoForm {

    private String numeroCartao;

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