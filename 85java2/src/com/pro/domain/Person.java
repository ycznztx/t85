package com.pro.domain;

/**
 * 类型：包括属性和方法
 * @author Administrator
 * 我们定义了复杂的类型，也叫自定义类型。
 * 类型，规定这一类的事物，都拥有哪些特征。
 * 类型还可以约束由此类创建的对象的属性范围 
 * 类型约束了谁？此类的每一个对象
 */
public class Person {	
	
	private  String name;
	
	private int age;
	
	private String sex;
	
	private int height;
	
	public void setName(String name){
		this.name=name;
	}
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getName() {
		return name;
	}


	void eat(){
		System.out.println("吃。。");
	}
	
	void work(){
		System.out.println("工作。。");
	}
	
}
