package rva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import rva.jpa.Proizvod;
import rva.jpa.Proizvodjac;
@Repository
public interface ProizvodjacRepository extends JpaRepository<Proizvodjac, Integer>{

List<Proizvodjac> findByNazivContainingIgnoreCase(String naziv);
}
