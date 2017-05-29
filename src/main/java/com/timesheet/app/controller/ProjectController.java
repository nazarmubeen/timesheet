package com.timesheet.app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.timesheet.app.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.timesheet.app.dao.ClientService;
import com.timesheet.app.dao.ProjectService;
import com.timesheet.app.model.Client;
import com.timesheet.app.model.Project;

@RequestMapping("/projectview")
@RestController
public class ProjectController {

	@Autowired
	ProjectService projectservice;
	@Autowired
	ClientService clientservice;
	Project project;
	

	 
	  @RequestMapping(value = "/updateproject/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<Project> updateProject(@PathVariable("id") long id, @RequestBody Project project) {
	        System.out.println("Updating Project " + id);
	         
	        Project currentproject = projectservice.findById(id);
	         
	        if (currentproject==null) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
	        }
	 
	        currentproject=project;
	        projectservice.setProject(currentproject);

	        return new ResponseEntity<Project>(currentproject, HttpStatus.OK);
	    }
	 

	  
	  @ResponseBody
	  @RequestMapping(value = "/deleteproject/{id}" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Project> deleteprojectPage(@PathVariable("id") long id) {
			
		  try{
		  System.out.println("Creating project " + id);
		  projectservice.deleteProject(id);;;
		  System.out.println("project deleted successfully");
	        HttpHeaders headers = new HttpHeaders();
	        return new ResponseEntity<Project>(project, HttpStatus.OK);  
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<Project>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}

	  
	  
	  
	  
	  @ResponseBody
	  @RequestMapping(value = "/getprojects" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<List<Project>> getprojects() {
			
		  try{
			
	        HttpHeaders headers = new HttpHeaders();
	        List<Project> projectlist=(List<Project>) projectservice.getAllProjects();
	        
	        
	        return new ResponseEntity<List<Project>>(projectlist, HttpStatus.OK);  
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<List<Project>>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}
	  
	  @ResponseBody
	  @RequestMapping(value = "/getprojects/{id}" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Project> getprojects(@PathVariable("id") long id) {
			
		  try{
			
	        HttpHeaders headers = new HttpHeaders();
	        Optional<Project> projectdetail;
	        System.out.println("Project Id is"+id);
	        projectdetail=projectservice.getProjectByProjectId(id);
	        if(projectdetail.isPresent())
	        {
	        	project=projectdetail.get();
	        	System.out.println("project id is "+project.getProjectId()+"clientid is"+project.getClient().getClientId());
	        	return new ResponseEntity<Project>(project, HttpStatus.OK);
	        }
	        else{
	        return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);  
	        }
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<Project>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}

	  
	  @ResponseBody
	  @RequestMapping(value = "/searchprojects/{id}" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<List<Project>> searchProjects(@PathVariable("id") long id) {
			
		  try{
			
	        HttpHeaders headers = new HttpHeaders();
	        List<Project> projectdetail;
	        System.out.println("Client Id is"+id);
	        
	        Client client=clientservice.findById(id);
	        
	        if(client!=null)
	        {
	        	  projectdetail=projectservice.getProjectByClient(client);
	  	        if(!projectdetail.isEmpty())
	  	        {
	  	        	
	  	        	return new ResponseEntity<List<Project>>(projectdetail, HttpStatus.OK);
	  	        }
	  	      else{
	  	        return new ResponseEntity<List<Project>>(HttpStatus.NOT_FOUND);  
	  	        }
	        	
	        }
	        
	      
	        else{
	        return new ResponseEntity<List<Project>>(HttpStatus.NOT_FOUND);  
	        }
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<List<Project>>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}
}
