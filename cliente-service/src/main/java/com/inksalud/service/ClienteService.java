package com.inksalud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inksalud.entity.Cliente;
import com.inksalud.repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return repository.save(cliente);
    }
}

