package com.joaomonteiro.support.internal.cliente.entity;

import com.joaomonteiro.support.internal.equipamento.entity.EquipamentoEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "CLientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 125)
    private String nome;
    @Column(nullable = false, length = 11, unique = true)
    private int cpf;
    @Column(nullable = false, length = 150)
    private String email;
    @Column(nullable = false)
    private boolean ativo;

    private List<EquipamentoEntity> equipamentos;

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }

    public ClienteEntity(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void ativar(boolean ativo) {
        this.ativo = true;
    }

    public void inativar(boolean ativo) {
        this.ativo = false;
    }
}
