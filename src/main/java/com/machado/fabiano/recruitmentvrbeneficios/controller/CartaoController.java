package com.machado.fabiano.recruitmentvrbeneficios.controller;

import com.machado.fabiano.recruitmentvrbeneficios.dto.CartaoDto;
import com.machado.fabiano.recruitmentvrbeneficios.dto.CartaoForm;
import com.machado.fabiano.recruitmentvrbeneficios.dto.CartaoSaldoDto;
import com.machado.fabiano.recruitmentvrbeneficios.dto.EmptyJsonResponse;
import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;
import com.machado.fabiano.recruitmentvrbeneficios.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {

    @Autowired
    private CartaoRepository cartaoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<CartaoDto> criarCartao(@RequestBody @Valid CartaoForm form) {
        Cartao cartao = form.converter();
        cartaoRepository.save(cartao);

        return ResponseEntity.status(HttpStatus.CREATED).body(new CartaoDto(cartao));
    }

    @GetMapping("/{numeroCartao}")
    public ResponseEntity<?> getSaldoCartao(@PathVariable String numeroCartao) {

        try {
            Cartao cartao = cartaoRepository.findByNumeroCartao(numeroCartao);
            return ResponseEntity.status(HttpStatus.OK).body(new CartaoSaldoDto(cartao));

        } catch (Exception e) {
            return new ResponseEntity(new EmptyJsonResponse(), HttpStatus.NOT_FOUND);
        }
    }
}
