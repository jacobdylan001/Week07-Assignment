package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import project.entity.Project;
import projects.dao.ProjectDao;

public class ProjectService {

	// Create an instance of ProjectDao
	
	private ProjectDao projectDao = new ProjectDao();

	// Responsible for adding new project to the system.
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {

		return projectDao.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
		
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException("Project with project ID=" +
																								projectId + " does not exist."));
	}
}