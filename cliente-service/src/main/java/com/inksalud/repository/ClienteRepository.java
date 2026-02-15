package com.inksalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inksalud.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

