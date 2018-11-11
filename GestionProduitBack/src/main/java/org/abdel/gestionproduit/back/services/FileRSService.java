package org.abdel.gestionproduit.back.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fileRSapi")
public class FileRSService {
	
	@Path("/ping")
	@GET
	@Produces(value= MediaType.APPLICATION_JSON)
	public String ping(){
		return "fileRSapi";
	}

}
