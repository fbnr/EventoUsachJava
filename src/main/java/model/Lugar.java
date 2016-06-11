package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="lugar")

@NamedQueries({
	@NamedQuery(name="Lugar.findByGPS", query="SELECT a FROM Lugar a WHERE a.latitud > :latitudAbajo AND a.latitud < :latitudArriba AND a.longitud > :longitudAbajo AND a.longitud < :longitudArriba")
		
})


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

	public List<Lugar> sacarLugarPorGps(List<Lugar> lugares){
		List<Lugar> GPS = new ArrayList<Lugar>();
		for (Lugar Lugar : lugares){
			int numero = Lugar.getIdLugar();
			if (numero==3){
				lugares.remove(Lugar);
			}
		}
		return lugares;
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