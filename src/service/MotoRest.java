package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import src.model.Moto;
import src.stockage.DaoMoto;


@Stateless
@Path("")
public class MotoRest {

    /**
     * This is a sample web service operation
     */
        @EJB
        private DaoMoto Moto;

	
	@GET
	@Path("/Motos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Moto> findAll(){
		return Moto.findAll();
	}
	
	@POST
	@Path("/Motos")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPersonne(Moto m){
		Moto.inserer(m);
	}
           
	@GET
	@Path("/Motos/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Moto find(@PathParam(value="id") int id){
		return (Moto) Moto.find(id);
	}
	
	@PUT
	@Path("/Motos")
	@Produces(MediaType.APPLICATION_JSON)
	public void modifier(Moto m){
		Moto.modifier(m);
	}
	
	@DELETE
	@Path("/Motos")
	@Produces(MediaType.APPLICATION_JSON)
	public void supprimer(@FormParam(value="id") int id){
		Moto.supprimer(id);
	}
}