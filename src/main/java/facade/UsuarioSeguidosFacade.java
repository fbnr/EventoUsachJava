package facade;

import java.util.List;

import javax.ejb.Local;

import model.UsuarioSeguidos;

@Local
public interface UsuarioSeguidosFacade {

	public void create(UsuarioSeguidos entity);

	public void edit(UsuarioSeguidos entity);

	public void remove(UsuarioSeguidos entity);

	public UsuarioSeguidos find(Object id);

	public List<UsuarioSeguidos> findAll();

	public List<UsuarioSeguidos> findRange(int[] range);

	//public List<FilmActor> findListActor(int id);
	
	public int count();

}
