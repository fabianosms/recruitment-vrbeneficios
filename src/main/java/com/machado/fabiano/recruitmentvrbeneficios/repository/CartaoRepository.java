package com.machado.fabiano.recruitmentvrbeneficios.repository;

import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    Cartao findByNumeroCartao(String numeroCartao);
}