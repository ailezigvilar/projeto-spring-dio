package org.digitalinnovationone.projetospringdio.service;

import org.digitalinnovationone.projetospringdio.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Optional<Cliente> buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
