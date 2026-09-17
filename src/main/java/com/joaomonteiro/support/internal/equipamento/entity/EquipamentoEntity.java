package com.joaomonteiro.support.internal.equipamento.entity;

import com.joaomonteiro.support.internal.cliente.entity.ClienteEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "Equipamentos")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EquipamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false, unique = true)
    private String numeroSerie;

    @JoinColumn(name = "cliente_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private ClienteEntity clienteEntity;

    public void associarCliente(ClienteEntity cliente) {
        this.clienteEntity = cliente;
    }

    public EquipamentoEntity(String tipo, String marca, String modelo, String numeroSerie) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
}
