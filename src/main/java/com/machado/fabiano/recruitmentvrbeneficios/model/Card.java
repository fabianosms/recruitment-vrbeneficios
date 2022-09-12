package com.machado.fabiano.recruitmentvrbeneficios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "cartao")
public class Card {

    @Id
    private Long cardNumber;

    private Integer pin;

    private BigDecimal balance;
}
