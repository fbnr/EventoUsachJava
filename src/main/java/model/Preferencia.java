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
@Table(name="preferencias")
@NamedQuery(name="Preferencia.findAll", query="SELECT a FROM Preferencia a")
public class Preferencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_preferencia", unique=true, nullable=false)
	private int idPreferencia;

	@Column(name="id_tipo", nullable=false)
	private int idTipo;

	@Column(name="id_usuario", nullable=false)
	private int idUsuario;
	
	public Preferencia() {
	}

	public int getIdPreferencia() {
		return this.idPreferencia;
	}

	public void setIdPreferencia(int idPreferencia) {
		this.idPreferencia = idPreferencia;
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

	public void setIdUsuario(int IdUsuario) {
		this.idUsuario = IdUsuario;
	}
	
}