package com.timesheet.app.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.app.model.Project;
import com.timesheet.app.model.Client;

@Service
public class ProjectServiceImpl implements ProjectService {

	private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
	
	@Override
	public Optional<Project> getProjectByProjectId(long projectId) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(projectRepository.findOne(projectId));
	}

	@Override
	public Collection<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public Project setProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	@Override
	public void deleteProject(long projectId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Project findById(long id) {
		// TODO Auto-generated method stub
		return projectRepository.findOne(id);
	}

	

	@Override
	public List<Project> getProjectByClient(Client client) {
		// TODO Auto-generated method stub
		return projectRepository.getProjectByClient(client);
	}

	

}
