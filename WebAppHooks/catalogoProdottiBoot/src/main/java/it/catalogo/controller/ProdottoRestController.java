package it.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.catalogo.model.Prodotto;
import it.catalogo.repository.ProdottoRepository;

@RestController
@RequestMapping("/prodottorest") //questo controller risponderà al path localhost:8080/prodottorest
public class ProdottoRestController {

	@Autowired
	ProdottoRepository prodottoService;
	
	
	@GetMapping("/get-prodotti") //risponde al path localhost:8080/prodottorest/get-prodotti
	public Iterable<Prodotto> getProdotti() {
		return prodottoService.findAll();
	}
	
	
	@GetMapping("/get-prodotto/{id}") //risponde al path localhost:8080/prodottorest/get-prodotto/{id}
	public Prodotto getProdotto(@PathVariable Integer id) {
		return prodottoService.findById(id).get();
	}
	
	@PostMapping("/add")	//se si va al path localhost:8080/prodottorest/add passando nel body il JSON 
	//contenente il prodotto da inserire, questo verrà inserito dato che questa è una funzionalità di tipo
	//Post Mapping
	public Prodotto add(@RequestBody Prodotto p) {
		return prodottoService.save(p);
	}
}
