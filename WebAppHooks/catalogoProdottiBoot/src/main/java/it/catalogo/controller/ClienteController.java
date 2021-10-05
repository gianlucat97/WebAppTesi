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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import it.catalogo.repository.*;
import it.catalogo.model.*;

@Controller
@RequestMapping("/clienti")
public class ClienteController {

	
	@Autowired
	private ClienteRepository repoC;
	
	//serve localhost:8080/clienti/lista
	@ResponseBody
	@GetMapping("/lista")
	public Iterable<Cliente> list() {
		
		Iterable<Cliente> clienti = repoC.findAll();
		
		//Dovrebbe essere una funzione inline (lambda function)
		clienti.forEach((Cliente c) -> {
			System.out.println(c.getNome());
		});
		
		return clienti;
	}
	
		
		
		//serve localhost:8080/clienti/catalogoclienti
		@GetMapping("/catalogoclienti")
		public ModelAndView indexClienti(@RequestParam(required = false) String id, ModelMap mm) {
					
					if(id != null) {
						Cliente cliente = new Cliente();
						cliente = repoC.findById(Integer.parseInt(id)).get();
						mm.addAttribute("clienteDaModificare",  cliente);
					}
					
					Iterable<Cliente> clienti = repoC.findAll();
					
					return new ModelAndView("indexClienti", "listaClienti", clienti);
		}
		
		
		
		@PostMapping("/add")
		public String add(@ModelAttribute("datiCliente") Cliente c) {
			repoC.save(c);
			return "redirect:/clienti/catalogoclienti";
		}
		
		
		@PostMapping("/update")
		public String update(@ModelAttribute("datiCliente") Cliente c) {
			repoC.save(c);
			return "redirect:/clienti/catalogoclienti";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam("id") String idCliente) {
			if(idCliente != null)
				repoC.deleteById(Integer.parseInt(idCliente));
			
			return "redirect:/clienti/catalogoclienti";
		}
	
	
	
	
}
