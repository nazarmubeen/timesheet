package com.timesheet.app.dao;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.timesheet.app.model.User;



public interface UserRepository extends JpaRepository<User, Long>{

	
		 @Query("FROM User u where u.email_id = :email_id") 
		 User getUserByEmailID(@Param("email_id") String email_id);
		 
		 @Modifying
		 @Transactional
		 @Query("update User u set u.password=:password where u.email_id = :email_id") 
		 void updateUserPassword(@Param("email_id") String email_id,@Param("password") String password);
	
		 
	
}
