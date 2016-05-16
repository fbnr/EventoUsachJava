package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.TipoEstadoFacade;
import model.TipoEstado;

@Stateless
public class TipoEstadoFacadeEJB extends AbstractFacade<TipoEstado> implements TipoEstadoFacade {
	
	
	@PersistenceContext(unitName = "eusach")
	private EntityManager em;
	
	public TipoEstadoFacadeEJB() {
		super(TipoEstado.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
