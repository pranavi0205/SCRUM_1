package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subtask")
public class SubTask {
    
	@Id
	private int subtaskId;
	private String subtaskName;
	private String description;
	private int primarytaskId;
	private int estimatedHours;
	private String status;
	private int priority;
	private String startDate;
	private String endDate;
	
	public SubTask() {}

	public SubTask(int subtaskId, String subtaskName, String description, int primarytaskId, int estimatedHours,
			String status, int priority, String startDate, String endDate) {
		super();
		this.subtaskId = subtaskId;
		this.subtaskName = subtaskName;
		this.description = description;
		this.primarytaskId = primarytaskId;
		this.estimatedHours = estimatedHours;
		this.status = status;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getSubtaskId() {
		return subtaskId;
	}

	public void setSubtaskId(int subtaskId) {
		this.subtaskId = subtaskId;
	}

	public String getSubtaskName() {
		return subtaskName;
	}

	public void setSubtaskName(String subtaskName) {
		this.subtaskName = subtaskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrimarytaskId() {
		return primarytaskId;
	}

	public void setPrimarytaskId(int primarytaskId) {
		this.primarytaskId = primarytaskId;
	}

	public int getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	}
