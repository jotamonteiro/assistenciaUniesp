package com.joaomonteiro.support.internal.equipamento.service;

import com.joaomonteiro.support.internal.cliente.dto.CriarClienteRequest;
import com.joaomonteiro.support.internal.equipamento.dto.CriarEquipamentoRequest;
import com.joaomonteiro.support.internal.equipamento.entity.EquipamentoEntity;
import com.joaomonteiro.support.internal.equipamento.repository.EquipamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EquipamentoService {

    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoEntity criarEquipamento(CriarEquipamentoRequest equipamentoRequest){
        EquipamentoEntity equipamentoEntity = new EquipamentoEntity(equipamentoRequest.tipo(), equipamentoRequest.marca(), equipamentoRequest.modelo(),equipamentoRequest.numeroSerie());

       return equipamentoRepository.save(equipamentoEntity);
    }
}
