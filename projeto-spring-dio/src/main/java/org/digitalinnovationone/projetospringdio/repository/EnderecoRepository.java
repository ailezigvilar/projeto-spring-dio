package org.digitalinnovationone.projetospringdio.repository;

import org.digitalinnovationone.projetospringdio.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco,String> {
}
