package br.gov.cultura.DitelAdm.repository.Faturas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cultura.DitelAdm.model.faturasV3.Trailler;



public interface Traillers extends JpaRepository<Trailler, Long>{

	public List<Trailler> findByIdTrailler(Integer idTrailler);
}