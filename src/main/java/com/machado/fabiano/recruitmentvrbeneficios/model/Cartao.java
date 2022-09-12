package com.machado.fabiano.recruitmentvrbeneficios.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCartao;

    private String senha;

    private BigDecimal balance;

    public Cartao(String numeroCartao, String senha, BigDecimal balance) {
        this.numeroCartao = numeroCartao;
        this.senha = senha;
        this.balance = balance;
    }

    public Cartao() {
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenha() {
        return senha;
    }
}