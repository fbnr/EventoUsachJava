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
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT a FROM Usuario a")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario", unique=true, nullable=false)
	private int idUsuario;

	@Id
	@Column(name="id_tipoestado", nullable=false)
	private int idTipoestado;

	@Column(name="nombre_usuario", nullable=false, length=50)
	private String nombreUsuario;
	
	@Column(name="correo_usuario", nullable=false, length=50)
	private String correoUsuario;
	
	@Column(name="carrera_usuario", nullable=false, length=50)
	private String carreraUsuario;
	
	@Column(name="contrasenha_usuario", nullable=false, length=50)
	private String contrasenhaUsuario;
	
	@Column(name="esAdministrador_")
	private Boolean esAdministrador;

	/*@Column(name="last_update", nullable=false)
	private Timestamp lastUpdate;*/

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}