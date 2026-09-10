package com.joaomonteiro.support.internal.cliente.service;

import com.joaomonteiro.support.internal.cliente.entity.ClienteEntity;
import com.joaomonteiro.support.internal.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteEntity criarCliente(ClienteEntity cliente){
            return clienteRepository.save(cliente);
    }

}
