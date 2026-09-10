package com.joaomonteiro.support.internal.cliente.controller;

import com.joaomonteiro.support.internal.cliente.entity.ClienteEntity;
import com.joaomonteiro.support.internal.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ClienteEntity salvarCliente(@RequestBody ClienteEntity cliente){
       return clienteService.criarCliente(cliente);
    }

}
