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
@Table(name="lugar")
@NamedQuery(name="Lugar.findAll", query="SELECT a FROM Lugar a")
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lugar", unique=true, nullable=false)
	private int idLugar;

	@Column(name="nombre_lugar", nullable=false, length=50)
	private String nombreLugar;
	
	@Column(name="latitud", nullable=false)
	private float latitud;
	
	@Column(name="longitud", nullable=false)
	private float longitud;

	public Lugar() {
	}

	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public String getNombreLugar() {
		return this.nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}
	
	public float getLatitud() {
		return this.latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	
	public float getLongitud() {
		return this.longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
}