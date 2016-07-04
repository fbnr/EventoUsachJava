package facade;

import java.util.List;

import javax.ejb.Local;

import model.Preferencia;

@Local
public interface PreferenciaFacade {

	public void create(Preferencia entity);

	public void edit(Preferencia entity);

	public void remove(Preferencia entity);

	public Preferencia find(Object id);

	public List<Preferencia> findAll();

	public List<Preferencia> findRange(int[] range);

	//public List<FilmActor> findListActor(int id);
	
	public int count();

	public void eliminarPreferencia(Integer id);

}
