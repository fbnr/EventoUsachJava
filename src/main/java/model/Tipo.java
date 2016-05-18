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
@Table(name="tipo")
@NamedQuery(name="Tipo.findAll", query="SELECT a FROM Tipo a")
public class Tipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo", unique=true, nullable=false)
	private int idTipo;

	@Column(name="tipo_evento", nullable=false, length=50)
	private String tipoEvento;

	@Column(name="descripcion", nullable=false, length=200)
	private String descripcionTipo;
	
	public Tipo() {
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEstado(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	public String getDescripcionTipo() {
		return this.descripcionTipo;
	}

	public void setDescripcionTipo(String descripcionTipo) {
		this.descripcionTipo = descripcionTipo;
	}
	
}