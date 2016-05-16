package facade;

import java.util.List;

import javax.ejb.Local;

import model.TipoEstado;

@Local
public interface TipoEstadoFacade {

	public void create(TipoEstado entity);

	public void edit(TipoEstado entity);

	public void remove(TipoEstado entity);

	public TipoEstado find(Object id);

	public List<TipoEstado> findAll();

	public List<TipoEstado> findRange(int[] range);

	public int count();

}
