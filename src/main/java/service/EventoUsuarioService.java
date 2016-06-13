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
import javax.ws.rs.QueryParam;

import facade.EventoUsuarioFacade;
import model.EventoUsuario;


@Path("/eventosusuarios")
public class EventoUsuarioService {
	
	@EJB 
	EventoUsuarioFacade eventoUsuarioFacadeEJB;
	
	//FilmActorFacade filmActorFacadeEJB;
	
	Logger logger = Logger.getLogger(EventoUsuarioService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<EventoUsuario> findAll(){
		return eventoUsuarioFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public EventoUsuario find(@PathParam("id") Integer id) {
        return eventoUsuarioFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(EventoUsuario entity) {
		eventoUsuarioFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, EventoUsuario entity) {
    	entity.setIdEventoUsuario(id.intValue());
    	eventoUsuarioFacadeEJB.edit(entity);
    }
	
    @GET
	@Path("/eliminar/{id}")
    @Produces({"application/xml", "application/json"})
    public void eliminarGraf(
    		@PathParam("id") Integer id) {
       eventoUsuarioFacadeEJB.eliminarEventoUsuario(id);
    }	
    
}
