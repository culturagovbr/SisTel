package br.gov.cultura.DitelAdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cultura.DitelAdm.modelo.Resumo;



public interface Resumos extends JpaRepository<Resumo, Long>{

	public List<Resumo> findByIdUnicoContaining(String idUnico);
}