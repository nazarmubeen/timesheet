package com.timesheet.app.controller;


import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.timesheet.app.dao.ClientService;
import com.timesheet.app.model.Client;
import com.timesheet.app.model.User;


@RestController
@RequestMapping("/client")
public class ClientController {
	
	 Client client;
	 @Autowired
	 private ClientService clientservice;
	 
	  @ResponseBody
	  @RequestMapping(value = "/registerclient" ,method=RequestMethod.POST,consumes=  MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Client> getClientPage(@RequestBody Client client,    UriComponentsBuilder ucBuilder) {
			
		  try{
			 System.out.println(client);
		  System.out.println("Creating client " + client.getClientName());
		 
		  System.out.println("client values"+client.toString());
		   
		  client.setCreatedDatetime(new Date());
		  client.setCreatedUser("nazar");
		  client.setStatus("pending");
		  client=clientservice.setClient(client);
		  System.out.println("clientId generated"+client.getClientId());
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/client/{id}").buildAndExpand(client.getClientId()).toUri());
	        System.out.println("ClientId generated"+client.getClientId());
	        return new ResponseEntity<Client>(client, HttpStatus.OK);  
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<Client>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}

}
