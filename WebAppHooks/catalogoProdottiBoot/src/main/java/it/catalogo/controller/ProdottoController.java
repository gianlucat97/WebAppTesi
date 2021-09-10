package it.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.catalogo.repository.*;
import it.catalogo.model.*;

@Controller
@RequestMapping("/")
public class ProdottoController {

	@Autowired
	private ProdottoRepository repo;
	
	//serve localhost:8080/lista
	@GetMapping("/lista")
	public String list() {
		
		Iterable<Prodotto> prods = repo.findAll();
		
		//Dovrebbe essere una funzione inline (lambda function)
		prods.forEach((Prodotto p) -> {
			System.out.println(p.getNome());
		});
		
		return "index";
	}
	
		//serve localhost:8080/prodotti
		@GetMapping("/prodotti")
		public ModelAndView index(@RequestParam(required = false) String id, ModelMap mm) {
			
			if(id != null) {
				Prodotto prod = new Prodotto();
				prod = repo.findById(Integer.parseInt(id)).get();
				mm.addAttribute("prodottoDaModificare",  prod);
			}
			
			Iterable<Prodotto> prods = repo.findAll();
			
			return new ModelAndView("indexProdotti", "listaProdotti", prods);
		}
		
		@PostMapping("/add")
		public String add(@ModelAttribute("datiProdotto") Prodotto p) {
			repo.save(p);
			return "redirect:/prodotti";
		}
		
		
		@PostMapping("/update")
		public String update(@ModelAttribute("datiProdotto") Prodotto p) {
			repo.save(p);
			return "redirect:/prodotti";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam("id") String idProdotto) {
			if(idProdotto != null)
				repo.deleteById(Integer.parseInt(idProdotto));
			
			return "redirect:/prodotti";
		}
	
	
	
	
}
