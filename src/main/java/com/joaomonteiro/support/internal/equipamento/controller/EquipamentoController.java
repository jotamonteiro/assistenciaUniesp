package com.joaomonteiro.support.internal.equipamento.controller;

import com.joaomonteiro.support.internal.equipamento.dto.CriarEquipamentoRequest;
import com.joaomonteiro.support.internal.equipamento.entity.EquipamentoEntity;
import com.joaomonteiro.support.internal.equipamento.service.EquipamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class EquipamentoController {
    public final EquipamentoService equipamentoService;

    @PostMapping
    public ResponseEntity<EquipamentoEntity> salvarEquipamento(CriarEquipamentoRequest equipamentoRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(equipamentoService.criarEquipamento(equipamentoRequest));
    }
}
