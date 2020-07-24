package com.pratmodi.stringbuilder;

public class Main {

	public static void main(String[] args) {
Pojo pojo = new Pojo();
pojo.setId("1");
pojo.setStatus(2);
Pojo pojo1 = new Pojo();
pojo1.getId();
pojo1.getStatus();

StringBuilder sb = new StringBuilder();
	sb.append(pojo1);
	System.out.println(sb);
		
	}

}
