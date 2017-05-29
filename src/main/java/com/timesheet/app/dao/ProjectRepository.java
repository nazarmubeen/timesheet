package com.timesheet.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.timesheet.app.model.Client;
import com.timesheet.app.model.Project;
import com.timesheet.app.model.User;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	
	 
	List<Project>  getProjectByClient(Client client);
	 
}
