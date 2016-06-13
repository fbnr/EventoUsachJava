package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import facade.AbstractFacade;
import facade.EventoUsuarioFacade;
import model.EventoUsuario;

@Stateless
public class EventoUsuarioFacadeEJB extends AbstractFacade<EventoUsuario> implements EventoUsuarioFacade {
	
	
	@PersistenceContext(unitName = "eusach")
	private EntityManager em;
	
	public EventoUsuarioFacadeEJB() {
		super(EventoUsuario.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}
	
	public void eliminarEventoUsuario(Integer id){
		Query q = em.createNamedQuery("EventoUsuario.deleteForId");
		q.setParameter("idEventoUsuario", id);
		q.executeUpdate();	
	}
	
}
