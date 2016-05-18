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
@Table(name="comentario")
@NamedQuery(name="Comentario.findAll", query="SELECT a FROM Comentario a")
public class Comentario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_comentario", unique=true, nullable=false)
	private int idComentario;
	
	@Column(name="id_usuario", nullable=false)
	private int idUsuario;
	
	@Column(name="id_evento", nullable=false)
	private int idEvento;
	
	@Column(name="texto_comentario", nullable=false, length=200)
	private String textoComentario;
	
	@Column(name="fecha_comentario", nullable=false)
	private Timestamp fechaComentario;
	
	public Comentario() {
	}

	public int getIdComentario() {
		return this.idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
		
	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	public String getTextoComentario() {
		return this.textoComentario;
	}

	public void setTextoComentario(String textoComentario) {
		this.textoComentario = textoComentario;
	}
	
	public Timestamp getFechaComentario() {
		return this.fechaComentario;
	}

	public void setFechaComentario(Timestamp fechaComentario) {
		this.fechaComentario = fechaComentario;
	}
		
}