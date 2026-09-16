package com.joaomonteiro.support.internal.cliente.controller;

import com.joaomonteiro.support.internal.cliente.dto.CriarClienteRequest;
import com.joaomonteiro.support.internal.cliente.entity.ClienteEntity;
import com.joaomonteiro.support.internal.cliente.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteEntity> salvarCliente(@RequestBody @Valid CriarClienteRequest cliente){
        clienteService.criarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).
                body(this.clienteService.criarCliente(cliente));
    }

}
