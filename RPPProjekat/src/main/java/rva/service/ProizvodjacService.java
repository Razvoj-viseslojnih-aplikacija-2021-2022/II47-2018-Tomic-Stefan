package rva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva.jpa.Proizvod;
import rva.jpa.Proizvodjac;
import rva.repository.ProizvodjacRepository;

@Service
public class ProizvodjacService {
	
	@Autowired
	private ProizvodjacRepository proizvodjacRepository;
	
public List<Proizvodjac> getAll(){
	return proizvodjacRepository.findAll();
}
}
