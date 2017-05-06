package com.scmoure.web.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scmoure.domain.Faculty;
import com.scmoure.service.FacultyService;

@Component
@Path("/faculty")
public class FacultyRestService {
	@Autowired
	FacultyService facultyService;
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test() {
		String hello = "hello";
		return Response.ok(hello, MediaType.TEXT_PLAIN).build();
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response create() {
		Faculty faculty = facultyService.create();
		return Response.ok(faculty, MediaType.APPLICATION_JSON).build();
	}
	
	@DELETE
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete() {
		facultyService.deleteAll();
		return Response.ok().build();
	}
	
	@PUT
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response modify() {
		Faculty faculty = facultyService.modify();
		return Response.ok().build();
	}
}
