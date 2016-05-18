package facade;

import java.util.List;

import javax.ejb.Local;

import model.EventoUsuario;

@Local
public interface EventoUsuarioFacade {

	public void create(EventoUsuario entity);

	public void edit(EventoUsuario entity);

	public void remove(EventoUsuario entity);

	public EventoUsuario find(Object id);

	public List<EventoUsuario> findAll();

	public List<EventoUsuario> findRange(int[] range);

	//public List<FilmActor> findListActor(int id);
	
	public int count();

}
