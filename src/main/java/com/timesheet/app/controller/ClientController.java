package com.timesheet.app.controller;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

	  @RequestMapping(value = "/updateclient/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<Client> updateUser(@PathVariable("id") long id, @RequestBody Client client) {
	        System.out.println("Updating User " + id);
	         
	        Client currentClient = clientservice.findById(id);
	         
	        if (currentClient==null) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
	        }
	 
	        currentClient=client;
	        clientservice.setClient(currentClient);

	        return new ResponseEntity<Client>(currentClient, HttpStatus.OK);
	    }
	 

	  
	  @ResponseBody
	  @RequestMapping(value = "/deleteclient/{id}" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Client> deleteClientPage(@PathVariable("id") long id) {
			
		  try{
		  System.out.println("Creating client " + id);
		  clientservice.deleteClient(id);;
		  System.out.println("client deleted successfully");
	        HttpHeaders headers = new HttpHeaders();
	        return new ResponseEntity<Client>(client, HttpStatus.OK);  
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<Client>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}

	  
	  
	  
	  
	  @ResponseBody
	  @RequestMapping(value = "/getclients" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<List<Client>> getClients() {
			
		  try{
			
	        HttpHeaders headers = new HttpHeaders();
	        List<Client> clientlist=(List<Client>) clientservice.getAllClients();
	        
	        
	        return new ResponseEntity<List<Client>>(clientlist, HttpStatus.OK);  
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<List<Client>>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}
	  
	  @ResponseBody
	  @RequestMapping(value = "/getclients/{id}" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Client> getClients(@PathVariable("id") long id) {
			
		  try{
			
	        HttpHeaders headers = new HttpHeaders();
	        Optional<Client> clientdetail;
	        clientdetail=clientservice.getClientByClientId(id);
	        if(clientdetail.isPresent())
	        {
	        	client=clientdetail.get();
	        	return new ResponseEntity<Client>(client, HttpStatus.OK);
	        }
	        else{
	        
	        return new ResponseEntity<Client>(client, HttpStatus.NOT_FOUND);  
	        }
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<Client>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}
}
