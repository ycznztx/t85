package com.pro.domain;

public class Tea {

	public Tea(){
		System.out.println("父类无参");
	}
	public Tea(String name){
		this.name=name;
		System.out.println("父类一参");
	}
	public String name;

	public void jk() {
		System.out.println(name+" jk...");
	}
}
