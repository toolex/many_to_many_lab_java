package com.codeclan.example.Business.controllers;


import com.codeclan.example.Business.models.Project;
import com.codeclan.example.Business.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
}
