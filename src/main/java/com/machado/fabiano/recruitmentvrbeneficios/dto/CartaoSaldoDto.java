package com.machado.fabiano.recruitmentvrbeneficios.dto;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;

public class CartaoSaldoDto {

    private BigDecimal saldo;

    public CartaoSaldoDto(Cartao cartao) {
        this.saldo = cartao.getSaldo();
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}