package service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import facade.EventoFacade;
import model.Evento;


@Path("/eventos")
public class EventoService {
	
	@EJB 
	EventoFacade eventoFacadeEJB;
	
	//FilmActorFacade filmActorFacadeEJB;
	
	Logger logger = Logger.getLogger(EventoService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Evento> findAll(){
		return eventoFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Evento find(@PathParam("id") Integer id) {
        return eventoFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Evento entity) {
		eventoFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Evento entity) {
    	entity.setIdEvento(id.intValue());
    	eventoFacadeEJB.edit(entity);
    }
	
    /*@GET
    @Path("delete_actor{id}")
    @Consumes({"application/xml", "application/json"})
    public void remove(@PathParam("id") Integer id, Actor entity){
    	List<FilmActor> l = filmActorFacadeEJB.findList(id);
    	for(int i = 0; i < l.size() ; i++){
    		filmActorFacadeEJB.remove(l.get(i));
    	}
    	entity = actorFacadeEJB.find(id);
    	actorFacadeEJB.remove(entity);
    }*/
    
}
