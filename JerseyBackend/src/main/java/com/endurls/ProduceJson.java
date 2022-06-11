package com.endurls;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.models.Student;

@Path("/json")
public class ProduceJson {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceString() {
		return new Student(101,"Ajay","Mumabi");
	}
}
