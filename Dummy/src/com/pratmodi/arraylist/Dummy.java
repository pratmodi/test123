package com.pratmodi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		List<Pojo> al = new ArrayList<Pojo>();
		/*for (int i = 0; i < 10; i++) {
			Pojo p = new Pojo();
			for (int j = 0; j < i; j++) {
				p.taskID = 1;
				p.taskPojo = "taskPojo";
				p.taskID++;
			}
			al.add(p);
		}

*/
		Pojo p1 = new Pojo();
		Pojo p = new Pojo();
		p.settaskID(1);
		p.settaskPojo(p1);
		
		al.add(p);
	
		for (Pojo pojo : al) {
			System.out.println(pojo);
			if(pojo.gettaskID()==1) {
				Pojo p2 = (Pojo) pojo.gettaskPojo();
			}
			
		}
		
		

		/*
		 * Iterator<Pojo> i = al.iterator(); while(i.hasNext()) {
		 * System.out.print(i.next()+" "); }
		 */
	}

}
