package com.pratmodi.stringbuilder;

public class Pojo {
	String id="20";
	int status=10;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", status=" + status + "]";
	}
	
	
}
