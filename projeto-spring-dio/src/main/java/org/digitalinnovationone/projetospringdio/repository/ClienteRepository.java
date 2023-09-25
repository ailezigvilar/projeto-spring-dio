package org.digitalinnovationone.projetospringdio.repository;


import org.digitalinnovationone.projetospringdio.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
