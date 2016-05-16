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
@Table(name="tipoestado")
@NamedQuery(name="TipoEstado.findAll", query="SELECT a FROM TipoEstado a")
public class TipoEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipoestado", unique=true, nullable=false)
	private int idTipoEstado;

	@Column(name="nombre_estado", nullable=false, length=45)
	private String nombreEstado;

	@Column(name="descripcion_estado", nullable=true, length=200)
	private String descripcionEstado;

	public TipoEstado() {
	}

	public int getIdTipoEstado() {
		return this.idTipoEstado;
	}

	public void setIdTipoEstado(int idTipoEstado) {
		this.idTipoEstado = idTipoEstado;
	}

	public String getNombreEstado() {
		return this.nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public String getDescripcionEstado() {
		return this.descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}
}