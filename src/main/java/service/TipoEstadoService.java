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

import facade.TipoEstadoFacade;
import model.TipoEstado;

@Path("/tipoestados")
public class TipoEstadoService {
	
	@EJB 
	TipoEstadoFacade filmFacadeEJB;
	
	Logger logger = Logger.getLogger(TipoEstadoService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<TipoEstado> findAll(){
		return filmFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public TipoEstado find(@PathParam("id") Integer id) {
        return filmFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(TipoEstado entity) {
        filmFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, TipoEstado entity) {
    	entity.setIdTipoEstado(id.intValue());
        filmFacadeEJB.edit(entity);
    }
    
    @GET
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void remove(@PathParam("id") Integer id, TipoEstado entity){
    	entity = filmFacadeEJB.find(id);
    	filmFacadeEJB.remove(entity);
    }
	

}
