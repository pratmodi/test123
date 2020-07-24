package com.pratmodi.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Test {

	public static void main(String[] args) {

		Set<String> taskIdList = new HashSet<String>();
		taskIdList.add("Prateek");
		taskIdList.add("Modi");
		taskIdList.add("Subhash");
		taskIdList.add("Sahu");
		taskIdList.add("Anjul");
		
		Iterator<String> iterator = taskIdList.iterator();
		String taskId = null;
		while (iterator.hasNext()) {
			taskId = iterator.next();
			deleteTaskDetailsFromES(taskId, "abc");
		}
		
	}
	
	public static void deleteTaskDetailsFromES(String taskId, String esType) {
		Set<String> taskIdList = new HashSet<String>();
		taskIdList.removeAll(taskIdList);
		System.out.println(taskIdList.size());
	}

}
