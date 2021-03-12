package com.javaex.mini.project;

public class Person {
	String name;
	String hp;
	String tel;
	
	public Person() {
		
	}
	
	public Person(String line) {
		int start = 0;
		int end = line.indexOf(',' , start);
		if (end > start) {
			name = line.substring(start , end);
			start = end + 1;
			end = line.indexOf(',' , start);
			if (end > start) {
				hp = line.substring(start , end);
				tel = line.substring(end + 1);
			} else {
				hp = line.substring(start);
				tel = "";
			}
		} else {
			name = line;
			hp = "";
			tel = "";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		return String.format("%s\t%s\t%s", name, hp, tel);
	}
	
}
