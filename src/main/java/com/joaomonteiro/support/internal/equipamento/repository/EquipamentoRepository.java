package com.joaomonteiro.support.internal.equipamento.repository;

import com.joaomonteiro.support.internal.equipamento.entity.EquipamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<EquipamentoEntity, Long> {
}
