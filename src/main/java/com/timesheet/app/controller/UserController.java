package com.timesheet.app.controller;


import java.text.DateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.util.UriComponentsBuilder;


import com.timesheet.app.dao.UserService;

import com.timesheet.app.model.User;
import org.springframework.http.MediaType;



@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	User user;
	@ResponseBody
	  @RequestMapping("/register")
	  public String create(String email_id, String name, String password) {
	    String userId = "";
	    try {
	    	String created_date="";
	    	String modified_date="";
	    	
	    user=new User(email_id, password, name, created_date, modified_date);  	
	   
	   user=userservice.setUsers(user);
	  
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created with id = " +user;
	  }
	  
	 @RequestMapping(value = "/recoverpassword" ,method=RequestMethod.GET)
	    public String getPasswordPage(@RequestParam Optional<String> error) {
	      return "password_recovery";
	    }
	
	  @RequestMapping(value = "/login" ,method=RequestMethod.GET)
	    public String getLoginPage(@RequestParam Optional<String> error) {
	      return "login";
	    }
	  @RequestMapping(value = "/project" ,method=RequestMethod.GET)
	    public String getProjectPage(@RequestParam Optional<String> error) {
	      return "project";
	    }
	  @RequestMapping(value = "/addproject" ,method=RequestMethod.GET)
	    public String getAddProjectPage(@RequestParam Optional<String> error) {
	      return "addproject";
	    }
	 
	  @RequestMapping(value = "/user" ,method=RequestMethod.GET)
	    public String getUserPage(@RequestParam Optional<String> error) {
	      return "user";
	    }
	  @RequestMapping(value = "/adduser" ,method=RequestMethod.GET)
	    public String getAddUserPage(@RequestParam Optional<String> error) {
	      return "adduser";
	    }
	  
	  @RequestMapping(value = "/clienthome" ,method=RequestMethod.GET)
	    public String getClientPage(@RequestParam Optional<String> error) {
	      return "client";
	    }
	 
	  @RequestMapping(value = "/addclient" ,method=RequestMethod.GET)
	    public String getAddClientPage(@RequestParam Optional<String> error) {
	      return "addclient";
	    }
	  @RequestMapping(value = "/searchclient" ,method=RequestMethod.GET)
	    public String getsearchClientPage(@RequestParam Optional<String> error) {
	      return "searchclient";
	    }
	  
	  @RequestMapping(value = "/navigation" ,method=RequestMethod.GET)
	    public String getHomePage(@RequestParam Optional<String> error) {
	      return "navigation";
	    }
	  @RequestMapping(value = "/home" ,method=RequestMethod.GET)
	    public String getMenuPage(@RequestParam Optional<String> error) {
	      return "menu";
	    }
	  
	  @RequestMapping(value = "/register" ,method=RequestMethod.GET)
	    public String getRegister(@RequestParam Optional<String> error) {
	      return "register";
	    }
	  @RequestMapping(value = "/test" ,method=RequestMethod.GET)
	    public String getTest(@RequestParam Optional<String> error) {
	      return "test";
	    }
	  
	  @ResponseBody
	  @RequestMapping(value = "/registeruser" ,method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<User> getRegisterPage(@RequestBody User user,    UriComponentsBuilder ucBuilder) {
	
		  try{
		  System.out.println("Creating User " + user.getName());
		  user.setCreated_date(DateFormat.getDateTimeInstance().format(new Date()).toString());
		  user.setModified_date(DateFormat.getDateTimeInstance().format(new Date()).toString());
		  user=userservice.setUsers(user);
		  
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getUser_id()).toUri());
	        System.out.println("UserId generated"+user.getUser_id());
	    
	        return new ResponseEntity<User>(user, HttpStatus.OK);  
		  }
		  catch(Exception e){
			  System.out.println(e);
			  return new ResponseEntity<User>(HttpStatus.EXPECTATION_FAILED);  
			  
		  }
		}
	  
}


