package com.timesheet.app.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.timesheet.app.model.Project;
import com.timesheet.app.model.Client;

public interface ProjectService {


	   Optional<Project> getProjectByProjectId(long projectId);
	   
	   List<Project> getProjectByClient(Client client);
	   
	    Collection<Project> getAllProjects();
	    
	    Project setProject(Project client);
	    
	    void deleteProject(long projectId);
	    
	    Project findById(long id);
	    
	  
}
