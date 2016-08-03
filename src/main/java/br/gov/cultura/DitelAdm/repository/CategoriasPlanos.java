package br.gov.cultura.DitelAdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cultura.DitelAdm.modelo.Categoriaplano;

public interface CategoriasPlanos extends JpaRepository<Categoriaplano, Long>{

	public List<Categoriaplano> findBySiglaContaining(String sigla);
}