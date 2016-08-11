package br.gov.cultura.DitelAdm.modelo;
// Generated 05/07/2016 12:36:15 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ChamadasId generated by hbm2java
 */
@Embeddable
public class ChamadasId implements java.io.Serializable {

	private String idChamadas;
	private String numTelefoneChamado;
	private Date dataLigacao;
	private Date horaLigacao;
	private int categoriaChamadaCodCatChamada;

	public ChamadasId() {
	}

	public ChamadasId(String idChamadas, String numTelefoneChamado, Date dataLigacao, Date horaLigacao,
			int categoriaChamadaCodCatChamada) {
		this.idChamadas = idChamadas;
		this.numTelefoneChamado = numTelefoneChamado;
		this.dataLigacao = dataLigacao;
		this.horaLigacao = horaLigacao;
		this.categoriaChamadaCodCatChamada = categoriaChamadaCodCatChamada;
	}

	@Column(name = "idChamadas", nullable = false)
	public String getIdChamadas() {
		return this.idChamadas;
	}

	public void setIdChamadas(String idChamadas) {
		this.idChamadas = idChamadas;
	}

	@Column(name = "numTelefoneChamado", nullable = false, length = 17)
	public String getNumTelefoneChamado() {
		return this.numTelefoneChamado;
	}

	public void setNumTelefoneChamado(String numTelefoneChamado) {
		this.numTelefoneChamado = numTelefoneChamado;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "dataLigacao", nullable = false, length = 10)
	public Date getDataLigacao() {
		return this.dataLigacao;
	}

	public void setDataLigacao(Date dataLigacao) {
		this.dataLigacao = dataLigacao;
	}
	@Temporal(TemporalType.TIME)
	@Column(name = "horaLigacao", nullable = false, length = 19)
	public Date getHoraLigacao() {
		return this.horaLigacao;
	}

	public void setHoraLigacao(Date horaLigacao) {
		this.horaLigacao = horaLigacao;
	}

	@Column(name = "categoriaChamada_codCatChamada", nullable = false)
	public int getCategoriaChamadaCodCatChamada() {
		return this.categoriaChamadaCodCatChamada;
	}

	public void setCategoriaChamadaCodCatChamada(int categoriaChamadaCodCatChamada) {
		this.categoriaChamadaCodCatChamada = categoriaChamadaCodCatChamada;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChamadasId))
			return false;
		ChamadasId castOther = (ChamadasId) other;

		return (this.getIdChamadas() == castOther.getIdChamadas())
				&& ((this.getNumTelefoneChamado() == castOther.getNumTelefoneChamado())
						|| (this.getNumTelefoneChamado() != null && castOther.getNumTelefoneChamado() != null
								&& this.getNumTelefoneChamado().equals(castOther.getNumTelefoneChamado())))
				&& ((this.getDataLigacao() == castOther.getDataLigacao())
						|| (this.getDataLigacao() != null && castOther.getDataLigacao() != null
								&& this.getDataLigacao().equals(castOther.getDataLigacao())))
				&& ((this.getHoraLigacao() == castOther.getHoraLigacao())
						|| (this.getHoraLigacao() != null && castOther.getHoraLigacao() != null
								&& this.getHoraLigacao().equals(castOther.getHoraLigacao())))
				&& (this.getCategoriaChamadaCodCatChamada() == castOther.getCategoriaChamadaCodCatChamada());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdChamadas() == null ? 0 : this.getIdChamadas().hashCode());
		result = 37 * result + (getNumTelefoneChamado() == null ? 0 : this.getNumTelefoneChamado().hashCode());
		result = 37 * result + (getDataLigacao() == null ? 0 : this.getDataLigacao().hashCode());
		result = 37 * result + (getHoraLigacao() == null ? 0 : this.getHoraLigacao().hashCode());
		result = 37 * result + this.getCategoriaChamadaCodCatChamada();
		return result;
	}

}
