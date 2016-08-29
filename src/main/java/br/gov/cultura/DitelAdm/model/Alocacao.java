package br.gov.cultura.DitelAdm.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Alocacao {

	@OneToOne(cascade = CascadeType.REFRESH, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	private Chip chip;

	@ManyToOne(cascade = CascadeType.REFRESH)
	private Usuario usuario;

	@OneToOne(cascade = CascadeType.REFRESH)
	private Dispositivo dispositivo;

	@OneToOne(cascade = CascadeType.REFRESH)
	private Linha linha;

	// @NotNull(message = "Data e obrigatorio!")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataRecebido;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataDevolvido;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataTemporario;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataRoaming;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@PrePersist
	public void dataRecebido() {
		this.dataRecebido = new Date();
	}

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setPessoa(Usuario usuario) {
		this.usuario = usuario;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	public Date getDataRecebido() {
		return dataRecebido;
	}

	public void setDataRecebido(Date dataRecebido) {
		this.dataRecebido = dataRecebido;
	}

	public Date getDataDevolvido() {
		return dataDevolvido;
	}

	public void setDataDevolvido(Date dataDevolvido) {
		this.dataDevolvido = dataDevolvido;
	}

	public Date getDataTemporario() {
		return dataTemporario;
	}

	public void setDataTemporario(Date dataTemporario) {
		this.dataTemporario = dataTemporario;
	}

	public Date getDataRoaming() {
		return dataRoaming;
	}

	public void setDataRoaming(Date dataRoaming) {
		this.dataRoaming = dataRoaming;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alocacao other = (Alocacao) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
