package com.springboot.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Backlog;

public interface BacklogRepository extends JpaRepository<Backlog, Integer> {

	

	List<Backlog> getBacklogByProjectId(int pid);

}
