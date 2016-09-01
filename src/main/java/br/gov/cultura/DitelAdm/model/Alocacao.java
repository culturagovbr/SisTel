package br.gov.cultura.DitelAdm.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Alocacao generated by hbm2java
 */
@Entity
@Table(name = "alocacao", catalog = "diteladmdev", uniqueConstraints = @UniqueConstraint(columnNames = "chip_id_chip"))
public class Alocacao implements java.io.Serializable {

	private Integer id;
	private Chip chip;
	private Dispositivo dispositivo;
	private Linha linha;
	private Usuario usuario;
	private Date dataDevolvido;
	private Date dataRecebido;
	private Date dataRoaming;
	private Date dataTemporario;

	public Alocacao() {
	}

	public Alocacao(Chip chip, Dispositivo dispositivo, Linha linha, Usuario usuario, Date dataDevolvido,
			Date dataRecebido, Date dataRoaming, Date dataTemporario) {
		this.chip = chip;
		this.dispositivo = dispositivo;
		this.linha = linha;
		this.usuario = usuario;
		this.dataDevolvido = dataDevolvido;
		this.dataRecebido = dataRecebido;
		this.dataRoaming = dataRoaming;
		this.dataTemporario = dataTemporario;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chip_id_chip")
	public Chip getChip() {
		return this.chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dispositivo_id_dispositivo")
	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "linha_id_linha")
	public Linha getLinha() {
		return this.linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id_usuario")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	@Column(name = "data_devolvido", length = 10)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public Date getDataDevolvido() {
		return this.dataDevolvido;
	}

	public void setDataDevolvido(Date dataDevolvido) {
		this.dataDevolvido = dataDevolvido;
	}

	
	@Column(name = "data_recebido", length = 10)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public Date getDataRecebido() {
		return this.dataRecebido;
	}

	public void setDataRecebido(Date dataRecebido) {
		this.dataRecebido = dataRecebido;
	}

	
	@Column(name = "data_roaming", length = 10)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public Date getDataRoaming() {
		return this.dataRoaming;
	}

	public void setDataRoaming(Date dataRoaming) {
		this.dataRoaming = dataRoaming;
	}

	
	@Column(name = "data_temporario", length = 10)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public Date getDataTemporario() {
		return this.dataTemporario;
	}

	public void setDataTemporario(Date dataTemporario) {
		this.dataTemporario = dataTemporario;
	}

}
