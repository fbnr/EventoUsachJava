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
@Table(name="usuarioseguidos")
@NamedQuery(name="UsuarioSeguidos.findAll", query="SELECT a FROM UsuarioSeguidos a")
public class UsuarioSeguidos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario", nullable=false)
	private int idUsuario;

	@Column(name="usu_id_usuario", nullable=false)
	private int usuIdUsuario;

	public UsuarioSeguidos() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getUsuIdUsuario() {
		return this.usuIdUsuario;
	}

	public void setUsuIdUsuario(int usuIdUsuario) {
		this.usuIdUsuario = usuIdUsuario;
	}
	
}