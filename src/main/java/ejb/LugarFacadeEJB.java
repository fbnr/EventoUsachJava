package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	// 1º equivale a 110km, 0.0005 equivale a 50 metros
	public List<Lugar> findLugarGPS(float lat, float lon){
		Query q = em.createNamedQuery("Lugar.findByGPS", Lugar.class);
		q.setParameter("longitudAbajo", (lon-0.0005));
		q.setParameter("longitudArriba", (lon+0.0005));
		q.setParameter("latitudAbajo", (lat-0.0005));
		q.setParameter("latitudArriba", (lat+0.0005));
		q.setParameter("revision", true);
		List<Lugar> lugares = q.getResultList();
		return lugares;
	}

}
