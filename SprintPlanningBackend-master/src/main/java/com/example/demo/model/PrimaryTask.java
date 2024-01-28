package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "primarytask")
public class PrimaryTask {
    
	@Id
	private int taskId;
	private String taskName;
	private String description;
	private int employeeId;

	public PrimaryTask() {}

	public PrimaryTask(int taskId, String taskName, String description, int employeeId) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.employeeId = employeeId;
		
	}



	public int getTaskId() {
		return taskId;
	}



	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}



	public String getTaskName() {
		return taskName;
	}



	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



		
}
