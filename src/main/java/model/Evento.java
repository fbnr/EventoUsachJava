package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="evento")
@NamedQuery(name="Evento.findAll", query="SELECT a FROM Evento a")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento", unique=true, nullable=false)
	private int idEvento;

	@Column(name="id_lugar", nullable=false)
	private int idLugar;

	@Column(name="id_tipo", nullable=false)
	private int idTipo;
	
	@Column(name="id_usuario", nullable=false)
	private int idUsuario;
	
	@Column(name="titulo_evento", nullable=false, length=50)
	private String tituloEvento;
	
	@Column(name="inicio_evento", nullable=false)
	private Timestamp inicioEvento;
	
	@Column(name="fin_evento", nullable=false)
	private Timestamp finEvento;
	
	@Column(name="fecha_evento", nullable=false)
	private Timestamp fechaEvento;
	
	@Column(name="descripcion_evento", nullable=false, length=200)
	private String descripcionEvento;

	public Evento() {
	}

	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	
	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getTituloEvento() {
		return this.tituloEvento;
	}

	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}
	
	public Timestamp getInicioEvento() {
		return this.inicioEvento;
	}

	public void setInicioEvento(Timestamp inicioEvento) {
		this.inicioEvento = inicioEvento;
	}
	
	public Timestamp getFinEvento() {
		return this.finEvento;
	}

	public void setFinEvento(Timestamp finEvento) {
		this.finEvento = finEvento;
	}
	
	public Timestamp getFechaEvento() {
		return this.fechaEvento;
	}

	public void setFechaEvento(Timestamp fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	
	public String getDescripcionEvento() {
		return this.descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}
	
}