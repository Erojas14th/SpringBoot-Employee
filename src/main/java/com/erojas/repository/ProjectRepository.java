package com.erojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erojas.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
