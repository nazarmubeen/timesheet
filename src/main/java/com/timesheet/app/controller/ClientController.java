package com.timesheet.app.controller;


import java.util.Optional;


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

import com.timesheet.app.model.Client;


@RestController
@RequestMapping("/client")
public class ClientController {
	
	 
	  @ResponseBody
	  @RequestMapping(value = "/registerclient" ,method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Client> getClientPage(@RequestBody Client client,    UriComponentsBuilder ucBuilder) {
			
		  try{

		  System.out.println("Creating client " + client.getClientName());

		  System.out.println("client values"+client.toString());
		  client.setClientId(100); 
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
