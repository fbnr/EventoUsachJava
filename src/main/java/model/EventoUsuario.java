package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="eventousuario")

@NamedQueries({
	@NamedQuery(name="EventoUsuario.deleteForId", query="DELETE FROM EventoUsuario a WHERE a.idEventoUsuario = :idEventoUsuario")
})

@NamedQuery(name="EventoUsuario.findAll", query="SELECT a FROM EventoUsuario a")
public class EventoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento_usuario", unique=true, nullable=false)
	private int idEventoUsuario;

	@Column(name="id_evento", nullable=false)
	private int idEvento;
	
	@Column(name="id_usuario", nullable=false)
	private int idUsuario;
	
	public EventoUsuario() {
	}
	
	public int getIdEventoUsuario() {
		return this.idEventoUsuario;
	}

	public void setIdEventoUsuario(int idEventoUsuario) {
		this.idEventoUsuario = idEventoUsuario;
	}


	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
			
	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
		
}