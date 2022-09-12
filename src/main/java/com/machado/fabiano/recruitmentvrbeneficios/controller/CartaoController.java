package com.machado.fabiano.recruitmentvrbeneficios.controller;

import com.machado.fabiano.recruitmentvrbeneficios.dto.CartaoDto;
import com.machado.fabiano.recruitmentvrbeneficios.dto.CartaoForm;
import com.machado.fabiano.recruitmentvrbeneficios.model.Cartao;
import com.machado.fabiano.recruitmentvrbeneficios.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {

    @Autowired
    private CartaoRepository cardRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<CartaoDto> createCard(@RequestBody @Valid CartaoForm form, UriComponentsBuilder uriBuilder) {
        Cartao card = form.converter();
        cardRepository.save(card);

        URI uri = uriBuilder.path("/cartoes/{id}").buildAndExpand(card.getNumeroCartao()).toUri();

        return ResponseEntity.created(uri).body(new CartaoDto(card));
    }
}
