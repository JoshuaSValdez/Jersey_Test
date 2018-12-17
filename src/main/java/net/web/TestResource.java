package net.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test() {
		return Response.ok("test").build();
	}

}