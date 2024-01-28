package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.PrimaryTask;

public interface PrimaryTaskRepo  extends CrudRepository<PrimaryTask,Integer>{

	public Iterable<PrimaryTask> deleteByTaskId(int taskId);
	public PrimaryTask findByTaskName(String taskName);
	
}
