package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.UsuarioSeguidosFacade;
import model.UsuarioSeguidos;

@Stateless
public class UsuarioSeguidosFacadeEJB extends AbstractFacade<UsuarioSeguidos> implements UsuarioSeguidosFacade {
	
	
	@PersistenceContext(unitName = "eusach")
	private EntityManager em;
	
	public UsuarioSeguidosFacadeEJB() {
		super(UsuarioSeguidos.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}
	
	/*public List<FilmActor> findListActor(int id) {
		return em.createQuery(
		    "SELECT c FROM FilmActor c WHERE c.actorId = :id_algo")
				.setParameter("id_algo", id)
				.getResultList();
		}*/

}
