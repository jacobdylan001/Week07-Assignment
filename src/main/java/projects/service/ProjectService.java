package projects.service;

import project.entity.Project;
import projects.dao.ProjectDao;

public class ProjectService {

	// Create an instance of ProjectDao
	
	private ProjectDao projectDao = new ProjectDao();

	// Responsible for adding new project to the system.
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
}