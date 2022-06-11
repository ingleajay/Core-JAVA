package com.endurls;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/string")
public class ProduceString {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String produceString() {
		return "I am ajay from jersey back End ";
	}
}
