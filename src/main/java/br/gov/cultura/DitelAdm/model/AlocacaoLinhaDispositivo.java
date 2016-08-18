package br.gov.cultura.DitelAdm.model;
// Generated 17/08/2016 19:31:54 by Hibernate Tools 4.3.4.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AlocacaoLinhaDispositivo generated by hbm2java
 */
@Entity
@Table(name = "alocacao_linha_dispositivo", catalog = "diteladmdev")
public class AlocacaoLinhaDispositivo implements java.io.Serializable {

	private AlocacaoLinhaDispositivoId id;
	private Dispositivo dispositivo;
	private Linha linha;
	private Date dtRecebimento;
	private Date dtDevolucao;

	public AlocacaoLinhaDispositivo() {
	}

	public AlocacaoLinhaDispositivo(AlocacaoLinhaDispositivoId id, Dispositivo dispositivo, Linha linha,
			Date dtRecebimento) {
		this.id = id;
		this.dispositivo = dispositivo;
		this.linha = linha;
		this.dtRecebimento = dtRecebimento;
	}

	public AlocacaoLinhaDispositivo(AlocacaoLinhaDispositivoId id, Dispositivo dispositivo, Linha linha,
			Date dtRecebimento, Date dtDevolucao) {
		this.id = id;
		this.dispositivo = dispositivo;
		this.linha = linha;
		this.dtRecebimento = dtRecebimento;
		this.dtDevolucao = dtDevolucao;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idAlocacaoLinhaDispositivo", column = @Column(name = "idAlocacao_linha_dispositivo", nullable = false)),
			@AttributeOverride(name = "linhaIdlinha", column = @Column(name = "linha_idlinha", nullable = false)),
			@AttributeOverride(name = "dispositivoIdDispositivo", column = @Column(name = "dispositivo_idDispositivo", nullable = false)) })
	public AlocacaoLinhaDispositivoId getId() {
		return this.id;
	}

	public void setId(AlocacaoLinhaDispositivoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dispositivo_idDispositivo", nullable = false, insertable = false, updatable = false)
	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "linha_idlinha", nullable = false, insertable = false, updatable = false)
	public Linha getLinha() {
		return this.linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtRecebimento", nullable = false, length = 19)
	public Date getDtRecebimento() {
		return this.dtRecebimento;
	}

	public void setDtRecebimento(Date dtRecebimento) {
		this.dtRecebimento = dtRecebimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtDevolucao", length = 19)
	public Date getDtDevolucao() {
		return this.dtDevolucao;
	}

	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

}
