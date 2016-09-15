package com.timesheet.app.dao;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.timesheet.app.model.User;


@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserById(long id) {
        return Optional.ofNullable(userRepository.findOne( id));
    }

 

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll(new Sort("email"));
    }

	@Override
	public User setUsers(User user) {
		
		  return userRepository.save(user);
	}

	@Override
	public Optional<User> getUserByEmailID(String email_id) {
		// TODO Auto-generated method stub
		return null;
	}


}
