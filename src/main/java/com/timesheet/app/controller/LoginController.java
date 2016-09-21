package com.timesheet.app.controller;


import java.text.DateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.MediaType;

import com.timesheet.app.dao.UserService;
import com.timesheet.app.model.User;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserService userservice;
	User user;
	
	@ResponseBody
    @RequestMapping(value = "/user/{email_id}/{password}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable("email_id") String email_id,@PathVariable("password") String password) {
        System.out.println("Fetching User with email_id " + email_id);
        System.out.println("Fetching User with password " + password);
        
        user = userservice.getUserByEmailID(email_id);
        System.out.println(" User  system password " +user.getPassword());
        if (user == null || !(user.getPassword().equalsIgnoreCase(password))) {
          System.out.println("User with id " + email_id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        else{
        	  System.out.println("User login with id " + email_id + " successful");
        	 return new ResponseEntity<User>(user,HttpStatus.OK); 
        }
       
    }
  
	
	}

