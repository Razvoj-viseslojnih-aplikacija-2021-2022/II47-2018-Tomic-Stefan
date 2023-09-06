package rva.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rva.jpa.Proizvod;
import rva.jpa.Proizvodjac;
import rva.repository.ProizvodjacRepository;
import rva.service.ProizvodjacService;

@RestController
public class ProizvodjacRestController {
	
	@Autowired
	private ProizvodjacService proizvodjacService; //injektovanje/ubacivanje svih metoda iz proizvod repository u ovaj restcontroller
	
	@GetMapping("proizvodjac")
	public Collection<Proizvodjac> getProizvodjaci() {
		return proizvodjacService.getAll();
	}
	/*
	@GetMapping("proizvod/{id}")
	public Proizvod getProizvod(@PathVariable("id") Integer id) {
		return proizvodRepository.getOne(id);
	}*/
}
