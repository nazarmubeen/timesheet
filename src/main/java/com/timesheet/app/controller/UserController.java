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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.timesheet.app.dao.UserRepository;
import com.timesheet.app.dao.UserService;
import com.timesheet.app.dao.UserServiceImpl;
import com.timesheet.app.model.User;



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
	  
	  @RequestMapping(value = "/login" ,method=RequestMethod.GET)
	    public String getLoginPage(@RequestParam Optional<String> error) {
	      return "login";
	    }
	  @RequestMapping(value = "/project" ,method=RequestMethod.GET)
	    public String getProjectPage(@RequestParam Optional<String> error) {
	      return "project";
	    }
	  @RequestMapping(value = "/client" ,method=RequestMethod.GET)
	    public String getClientPage(@RequestParam Optional<String> error) {
	      return "client";
	    }
	  @RequestMapping(value = "/user" ,method=RequestMethod.GET)
	    public String getUserPage(@RequestParam Optional<String> error) {
	      return "user";
	    }
	  @RequestMapping(value = "/navigation" ,method=RequestMethod.GET)
	    public String getHomePage(@RequestParam Optional<String> error) {
	      return "navigation";
	    }
	  @RequestMapping(value = "/home" ,method=RequestMethod.GET)
	    public String getMenuPage(@RequestParam Optional<String> error) {
	      return "home";
	    }
	  @RequestMapping(value = "/addclient" ,method=RequestMethod.GET)
	    public String getClientAddPage(@RequestParam Optional<String> error) {
	      return "addclient";
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
	  @RequestMapping(value = "/registeruser" ,method=RequestMethod.POST)
	    public ResponseEntity<User> getRegisterPage(@RequestBody User user,    UriComponentsBuilder ucBuilder) {
	
		  System.out.println("Creating User " + user.getName());
		  user.setCreated_date(DateFormat.getDateTimeInstance().format(new Date()).toString());
		  user.setModified_date(DateFormat.getDateTimeInstance().format(new Date()).toString());
		  user=userservice.setUsers(user);
		  
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getUser_id()).toUri());
	        headers.setLocation(ucBuilder.path("/user/{email_id}").buildAndExpand(user.getEmail_id()).toUri());
	        return new ResponseEntity<User>(headers, HttpStatus.CREATED);  
		
		
		}
	  
}


