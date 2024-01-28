package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.SubTask;

public interface SubTaskRepo  extends CrudRepository<SubTask,Integer>{

public Iterable<SubTask> deleteBySubtaskId(int subtaskId);
public Iterable<SubTask> findAllByPrimarytaskId(int primarytaskId);
		
}
