package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.TipoFacade;
import model.Tipo;

@Stateless
public class TipoFacadeEJB extends AbstractFacade<Tipo> implements TipoFacade {
	
	
	@PersistenceContext(unitName = "eusach")
	private EntityManager em;
	
	public TipoFacadeEJB() {
		super(Tipo.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
