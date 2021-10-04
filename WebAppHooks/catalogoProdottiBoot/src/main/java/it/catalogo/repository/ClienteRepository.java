package it.catalogo.repository;

import org.springframework.data.repository.CrudRepository;

import it.catalogo.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
