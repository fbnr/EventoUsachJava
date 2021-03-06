package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import facade.AbstractFacade;
import facade.PreferenciaFacade;
import model.Preferencia;

@Stateless
public class PreferenciaFacadeEJB extends AbstractFacade<Preferencia> implements PreferenciaFacade {
	
	
	@PersistenceContext(unitName = "eusach")
	private EntityManager em;
	
	public PreferenciaFacadeEJB() {
		super(Preferencia.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}
	
	public void eliminarPreferencia(Integer id){
		Query q = em.createNamedQuery("Preferencia.deleteForId");
		q.setParameter("idPreferencia", id);
		q.executeUpdate();	
	}

	/*public List<FilmActor> findListActor(int id) {
		return em.createQuery(
		    "SELECT c FROM FilmActor c WHERE c.actorId = :id_algo")
				.setParameter("id_algo", id)
				.getResultList();
		}*/

}
