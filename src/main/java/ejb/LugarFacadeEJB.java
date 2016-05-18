package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.LugarFacade;
import model.Lugar;

@Stateless
public class LugarFacadeEJB extends AbstractFacade<Lugar> implements LugarFacade {
	
	
	@PersistenceContext(unitName = "eusach")
	private EntityManager em;
	
	public LugarFacadeEJB() {
		super(Lugar.class);
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
