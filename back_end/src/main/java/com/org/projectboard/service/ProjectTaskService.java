package com.org.projectboard.service;

import com.org.projectboard.domain.ProjectTask;
import com.org.projectboard.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrupdateProjectTask(ProjectTask projectTask){

        if (projectTask.getStatus()==null || projectTask.getStatus()==""){
            projectTask.setStatus("TO_DO");
        }

        return projectTaskRepository.save(projectTask);
    }

    public Iterable<ProjectTask> findAll(){
        return projectTaskRepository.findAll();
    }

    public ProjectTask findById(Long id){
        return projectTaskRepository.findById(id).get();
    }

    public void deleteTask(Long Id) {
        ProjectTask projectTask = findById(Id);
        projectTaskRepository.delete(projectTask);
    }
}
