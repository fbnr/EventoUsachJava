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

import facade.UsuarioSeguidosFacade;
import model.UsuarioSeguidos;


@Path("/usuarioseguidos")
public class UsuarioSeguidosService {
	
	@EJB 
	UsuarioSeguidosFacade usuarioseguidoFacadeEJB;
	
	//FilmActorFacade filmActorFacadeEJB;
	
	Logger logger = Logger.getLogger(UsuarioSeguidosService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<UsuarioSeguidos> findAll(){
		return usuarioseguidoFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public UsuarioSeguidos find(@PathParam("id") Integer id) {
        return usuarioseguidoFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(UsuarioSeguidos entity) {
		usuarioseguidoFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, UsuarioSeguidos entity) {
    	entity.setIdUsuario(id.intValue());
    	usuarioseguidoFacadeEJB.edit(entity);
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
