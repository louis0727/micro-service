package com.louisrong.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.New;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.louisrong.dto.UserinfoDto;
import com.louisrong.dto.UserinfoRequest;
import com.louisrong.dto.UserinfoResponse;
import com.louisrong.service.UserInfoService;
import com.louisrongentity.Userinformation;



@Stateless
@Path("micro")
public class MicroResource {

	
	private static Logger logger = LoggerFactory.getLogger(MicroResource.class);
	
	private Object env;
	
	@Inject
	private UserInfoService userInfoService; 


	public Object getEnv() {
		return env;
	}

	public void setEnv(Object env) {
		this.env = env;
	}
	
	@POST
	@Path("/search")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response search(UserinfoRequest request) {
		logger.debug("call search start");
		List<UserinfoDto> userinfoDtos = Lists.newArrayList();
		List<Userinformation> userinformations =  userInfoService.findAll();
		if(userinformations!=null && userinformations.size() >0) {
			for(Userinformation item:userinformations) {
				logger.debug("have data:{}",item.getId());
				userinfoDtos.add(new UserinfoDto(item));
			}
			
		}
		UserinfoResponse response = new UserinfoResponse();
		
		response.setUserinfoDtos(userinfoDtos);
		logger.debug("call search end");
		return Response.status(Status.OK).entity(new Gson().toJson(response)).build();
	}
	

	@GET
	public Object value() {
		env = executeCommand("printenv");
		System.out.println(env);
//		return  "call micro service successful...currentTime:"+System.currentTimeMillis()+"\n"+new Gson().toJson(this.env);
		return Response.status(Status.OK).entity(env).build();
	}
	
	public String executeCommand(String command) {

	    StringBuffer output = new StringBuffer();

	    Process p;
	    try {
	        p = Runtime.getRuntime().exec(command);
	        p.waitFor();
	        BufferedReader reader = 
	                        new BufferedReader(new InputStreamReader(p.getInputStream()));

	        String line = "";           
	        while ((line = reader.readLine())!= null) {
	            output.append(line + "\n");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return output.toString();

	}

	
	
}
