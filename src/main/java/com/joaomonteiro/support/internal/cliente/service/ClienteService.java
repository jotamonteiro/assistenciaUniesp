package com.joaomonteiro.support.internal.cliente.service;

import com.joaomonteiro.support.internal.cliente.dto.CriarClienteRequest;
import com.joaomonteiro.support.internal.cliente.entity.ClienteEntity;
import com.joaomonteiro.support.internal.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteEntity criarCliente(CriarClienteRequest clienteRequest){
            ClienteEntity cliente = new ClienteEntity(clienteRequest.nome(),clienteRequest.cpf(),clienteRequest.email());
        return clienteRepository.save(cliente);
    }

}
