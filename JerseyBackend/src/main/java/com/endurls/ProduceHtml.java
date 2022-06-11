package com.endurls;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/html")
public class ProduceHtml {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String produceString() {
		return "<h1>Hey, I am Ajay </h1>";
	}
}
