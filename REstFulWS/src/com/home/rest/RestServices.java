package com.home.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Path("/webservices")
public class RestServices {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String showMsg() {
		return "hello, this is my first wev service";
	}
	
	@GET
	@Path("/getlist")
	@Produces(MediaType.TEXT_XML)
	public String getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ankush");
		list.add("srumith");
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}
	

}
