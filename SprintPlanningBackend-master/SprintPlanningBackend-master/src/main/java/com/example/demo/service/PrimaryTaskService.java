package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PrimaryTaskRepo;

import com.example.demo.model.PrimaryTask;

@Service
public class PrimaryTaskService {
 
	
	@Autowired
	private PrimaryTaskRepo repo;
	
	public PrimaryTaskService() {}

	public PrimaryTaskService(PrimaryTaskRepo repo) {
		super();
		this.repo = repo;
	}
	
	public void savePrimaryTask(PrimaryTask task)
	{
		repo.save(task);
	}
	 public Iterable<PrimaryTask> showAllTasks()
	    {
	    	return repo.findAll();
	    }
//	 public Iterable<PrimaryTask> deleteByTask_id(int task_id)
//	    {
//	    	repo.deleteByTask_id(task_id);
//	    	return repo.findAll();
//	    }

	 public Iterable<PrimaryTask> deleteBytaskid(int taskId)
	    {
	    	repo.deleteByTaskId(taskId);
	    	return repo.findAll();
	    }
	 
	 public Iterable<PrimaryTask> Update(PrimaryTask task)
	 {
		 
		 repo.save(task);
		 return repo.findAll();
	 }
	 
	 public PrimaryTask findBytaskname(String taskName)
	 {
		return  repo.findByTaskName(taskName);
		 
	 }
	 
}
