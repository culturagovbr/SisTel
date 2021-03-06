package br.gov.cultura.DitelAdm.model.faturasV3;
// Generated 29/08/2016 10:12:50 by Hibernate Tools 4.3.4.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categoriaservico MODEL: Padrão FEBRABAN v3
 */
@Entity
@Table(name = "categoria_servico", catalog = "dbditel")
public class Categoriaservico implements java.io.Serializable {

	private Integer idCatServico;
	private int codCatServico;
	private String sigla;
	private String descricao;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Servicos> servicoses = new HashSet(0);

	public Categoriaservico() {
	}

	public Categoriaservico(int codCatServico, String sigla, String descricao) {
		this.codCatServico = codCatServico;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Categoriaservico(int codCatServico, String sigla, String descricao, Set<Servicos> servicoses) {
		this.codCatServico = codCatServico;
		this.sigla = sigla;
		this.descricao = descricao;
		this.servicoses = servicoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_catServico", unique = true, nullable = false)
	public Integer getIdCatServico() {
		return this.idCatServico;
	}

	public void setIdCatServico(Integer idCatServico) {
		this.idCatServico = idCatServico;
	}

	@Column(name = "codCatServico", nullable = false)
	public int getCodCatServico() {
		return this.codCatServico;
	}

	public void setCodCatServico(int codCatServico) {
		this.codCatServico = codCatServico;
	}

	@Column(name = "sigla", nullable = false, length = 3)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "descricao", nullable = false, length = 25)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriaservico")
	public Set<Servicos> getServicoses() {
		return this.servicoses;
	}

	public void setServicoses(Set<Servicos> servicoses) {
		this.servicoses = servicoses;
	}

}
