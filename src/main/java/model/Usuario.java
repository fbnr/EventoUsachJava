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

	@Column(name="id_tipoestado", nullable=false)
	private int idTipoestado;

	@Column(name="nombre_usuario", nullable=false, length=50)
	private String nombreUsuario;
	
	@Column(name="apellido_usuario", nullable=false, length=50)
	private String apellidoUsuario;
	
	@Column(name="correo_usuario", nullable=false, length=50)
	private String correoUsuario;
	
	@Column(name="carrera_usuario", nullable=false, length=50)
	private String carreraUsuario;
	
	@Column(name="contrasenha_usuario", nullable=false, length=50)
	private String contrasenhaUsuario;
	
	@Column(name="esAdministrador_")
	private boolean esAdministrador;

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

	public int getIdTipoEstado() {
		return this.idTipoestado;
	}

	public void setIdTipoEstado(int idTipoestado) {
		this.idTipoestado = idTipoestado;
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getApellidoUsuario() {
		return this.apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	
	public String getCorreoUsuario() {
		return this.correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	
	public String getCarreraUsuario() {
		return this.carreraUsuario;
	}

	public void setCarreraUsuario(String carreraUsuario) {
		this.carreraUsuario = carreraUsuario;
	}
	
	public String getContrasenhaUsuario() {
		return this.contrasenhaUsuario;
	}

	public void setContrasenhaUsuario(String contrasenhaUsuario) {
		this.contrasenhaUsuario = contrasenhaUsuario;
	}
	
	public boolean getAdministrador() {
		return this.esAdministrador;
	}

	/*public void setAdministrador(boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	}*/

}