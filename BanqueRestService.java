package service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bonjour")
public class BanqueRestService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Test () {
		return "Bonjour, tout le monde, comment allez vous?";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
	    return "<html><title>Hello</title><body><h1>Bonjour, tout le monde!</h1><body></html>";
	}
	@GET
	@Path(value = "/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversion (@PathParam(value = "montant") double mt) {
		return mt*11;
	}

}
