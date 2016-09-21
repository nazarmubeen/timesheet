package com.timesheet.app.dao;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.timesheet.app.model.User;



public interface UserService {

	Optional<User> getUserById(long id);

    
    Collection<User> getAllUsers();
    
    User setUsers(User user);

	User getUserByEmailID(String email_id);


	
    
    
}
