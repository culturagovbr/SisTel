package br.gov.cultura.DitelAdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.cultura.DitelAdm.model.LimiteAtesto;
import br.gov.cultura.DitelAdm.repository.LimitesAtestos;

@Service
@Transactional
public class LimiteAtestoService {

		@Autowired
		private LimitesAtestos limitesAtestos;
		
		public void salvar(LimiteAtesto limiteAtesto){
			limitesAtestos.save(limiteAtesto);
		}
		
		public List<LimiteAtesto> getLimitesAtesto() {
			return limitesAtestos.findAll();
		}
		public LimiteAtesto getLimiteAtestoId(Integer id){
			return limitesAtestos.findOne(id);
		}
		public void excluir(Integer idLimiteAtesto){
			limitesAtestos.delete(idLimiteAtesto);
		}
}
