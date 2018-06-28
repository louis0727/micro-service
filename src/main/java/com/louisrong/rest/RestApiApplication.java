package com.louisrong.rest;



import javax.json.stream.JsonGenerator;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("rest")
public class RestApiApplication extends ResourceConfig{
	//extends ResourceConfig

	public RestApiApplication() {
		packages(false, "com.louisrong.rest");
		
		// Define the root resource, providers explicitly
		property(JsonGenerator.PRETTY_PRINTING, true);
		
	}

	
	


}
