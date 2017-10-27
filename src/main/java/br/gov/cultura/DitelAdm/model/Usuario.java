package br.gov.cultura.DitelAdm.model;
// Generated 27/04/2017 16:07:37 by Hibernate Tools 4.0.0.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Usuário MODEL
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "usuario", catalog = "dbditel")
public class Usuario implements java.io.Serializable {

	private Integer idUsuario;
	private String cargoUsuario;
	private String cpfUsuario;
	private String descricaoUsuario;
	private String emailUsuario;
	private String lotacaoIdUsuario;
	private String lotacaoUsuario;
	private String primeiroNomeUsuario;
	private String sobrenomeUsuario;
	private String nomeUsuario;
	private String usuarioSigla;
	@JsonBackReference
	private LimiteAtesto limiteAtesto;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@JsonManagedReference
	private Set<Alocacao> alocacaos = new HashSet(0);

	public Usuario() {
	}

	public Usuario(LimiteAtesto limiteAtesto, String cargoUsuario, String cpfUsuario, String lotacaoUsuario,
			String nomeUsuario) {
		this.limiteAtesto = limiteAtesto;
		this.cargoUsuario = cargoUsuario;
		this.cpfUsuario = cpfUsuario;
		this.lotacaoUsuario = lotacaoUsuario;
		this.nomeUsuario = nomeUsuario;
	}

	public Usuario(LimiteAtesto limiteAtesto, String cargoUsuario, String cpfUsuario, String descricaoUsuario,
			String emailUsuario, String lotacaoIdUsuario, String lotacaoUsuario, String primeiroNomeUsuario,
			String sobrenomeUsuario, String nomeUsuario, String usuarioSigla, Set<Alocacao> alocacaos) {
		this.limiteAtesto = limiteAtesto;
		this.cargoUsuario = cargoUsuario;
		this.cpfUsuario = cpfUsuario;
		this.descricaoUsuario = descricaoUsuario;
		this.emailUsuario = emailUsuario;
		this.lotacaoIdUsuario = lotacaoIdUsuario;
		this.lotacaoUsuario = lotacaoUsuario;
		this.primeiroNomeUsuario = primeiroNomeUsuario;
		this.sobrenomeUsuario = sobrenomeUsuario;
		this.nomeUsuario = nomeUsuario;
		this.usuarioSigla = usuarioSigla;
		this.alocacaos = alocacaos;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_usuario", unique = true, nullable = false)
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "limite_atesto_id_limite_atesto", nullable = false)
	public LimiteAtesto getLimiteAtesto() {
		return this.limiteAtesto;
	}

	public void setLimiteAtesto(LimiteAtesto limiteAtesto) {
		this.limiteAtesto = limiteAtesto;
	}
	@Column(name = "cargo_usuario", nullable = false)
	@NotEmpty(message="Cargo e obrigat�rio!")
	@Size(max = 100, message = "Maximo de 100 caracteres para cargo!")
	public String getCargoUsuario() {
		return this.cargoUsuario;
	}

	public void setCargoUsuario(String cargoUsuario) {
		this.cargoUsuario = cargoUsuario;
	}
	@Column(name = "cpf_usuario", nullable = false, length = 11)
	@CPF(message="CPF  inválido!")
	@NotNull(message="CPF e obrigat�rio!")
	public String getCpfUsuario() {
		return this.cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	@Column(name = "descricao_usuario", length = 255)
	@Size(max = 250, message = "Maximo de 250 caracteres para descrição!")
	public String getDescricaoUsuario() {
		return this.descricaoUsuario;
	}

	public void setDescricaoUsuario(String descricaoUsuario) {
		this.descricaoUsuario = descricaoUsuario;
	}
	@Column(name = "email_usuario", length = 255)
	//@NotEmpty(message="Email e obrigatório!")
	public String getEmailUsuario() {
		return this.emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	@Column(name = "lotacao_id_usuario")	
	public String getLotacaoIdUsuario() {
		return this.lotacaoIdUsuario;
	}

	public void setLotacaoIdUsuario(String lotacaoIdUsuario) {
		this.lotacaoIdUsuario = lotacaoIdUsuario;
	}
	@Column(name = "lotacao_usuario", nullable = false)
	public String getLotacaoUsuario() {
		return this.lotacaoUsuario;
	}

	public void setLotacaoUsuario(String lotacaoUsuario) {
		this.lotacaoUsuario = lotacaoUsuario;
	}
	@Column(name = "primeiro_nome_usuario", length = 255)
	//@NotEmpty(message="Sobrenome e obrigat�rio!")
	@Size(max = 100, message = "Maximo de 100 caracteres para sobrenome!")
	public String getPrimeiroNomeUsuario() {
		return this.primeiroNomeUsuario;
	}

	public void setPrimeiroNomeUsuario(String primeiroNomeUsuario) {
		this.primeiroNomeUsuario = primeiroNomeUsuario;
	}
	@Column(name = "sobrenome_usuario", length = 255)
	//@NotEmpty(message="Sobrenome e obrigat�rio!")
	@Size(max = 200, message = "Maximo de 200 caracteres para sobrenome!")
	public String getSobrenomeUsuario() {
		return this.sobrenomeUsuario;
	}

	public void setSobrenomeUsuario(String sobrenomeUsuario) {
		this.sobrenomeUsuario = sobrenomeUsuario;
	}
	@Column(name = "nome_usuario", nullable = false, length = 255)
	@NotEmpty(message="Nome e obrigatorio!")
	@Size(max = 100, message = "Maximo de 100 caracteres para nome!")
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Alocacao> getAlocacaos() {
		return this.alocacaos;
	}

	public void setAlocacaos(Set<Alocacao> alocacaos) {
		this.alocacaos = alocacaos;
	}
	@Column(name="usuario_sigla_sei")
	public String getUsuarioSigla() {
		return usuarioSigla;
	}

	public void setUsuarioSigla(String usuarioSigla) {
		this.usuarioSigla = usuarioSigla;
	}
	

}
