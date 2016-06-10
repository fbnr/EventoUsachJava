package service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


import facade.LugarFacade;
import model.Lugar;


@Path("/lugares")
public class LugarService {
	
	@EJB 
	LugarFacade lugarFacadeEJB;
	
	//FilmActorFacade filmActorFacadeEJB;
	
	Logger logger = Logger.getLogger(LugarService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Lugar> findAll(){
		return lugarFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Lugar find(@PathParam("id") Integer id) {
        return lugarFacadeEJB.find(id);
    }
	
	//GET POR COORDENADAS 
	//SE BUSCA /GPS?latitud=13131&longitud=11212
	//Se considera un cuadrante de 100m2 
	@GET
	@Path("/GPS")
	@Produces({"application/xml", "application/json"})
	public List<Lugar> findForGPS(
			@QueryParam("longitud") float longitud,
			@QueryParam("latitud") float latitud){
		return lugarFacadeEJB.findLugarGPS(latitud, longitud);
	}
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Lugar entity) {
		lugarFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Lugar entity) {
    	entity.setIdLugar(id.intValue());
    	lugarFacadeEJB.edit(entity);
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
