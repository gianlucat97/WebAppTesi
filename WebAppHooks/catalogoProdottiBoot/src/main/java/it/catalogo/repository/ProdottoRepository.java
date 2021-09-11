package it.catalogo.repository;

import org.springframework.data.repository.CrudRepository;

import it.catalogo.model.Prodotto;

public interface ProdottoRepository extends CrudRepository<Prodotto, Integer>{

}
