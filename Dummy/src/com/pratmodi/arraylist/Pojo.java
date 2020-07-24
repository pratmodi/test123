package com.pratmodi.arraylist;

public class Pojo {

	Integer taskID;
	Pojo taskPojo;
	
	public Integer gettaskID() {
		return taskID;
	}
	public void settaskID(Integer key) {
		this.taskID = key;
	}
	public Object gettaskPojo() {
		return taskPojo;
	}
	public void settaskPojo(Pojo taskPojo) {
		this.taskPojo = taskPojo;
	}
	
	@Override
	public String toString() {
		return "Pojo [key=" + taskID + ", value=" + taskPojo + "]";
	}
	
}
