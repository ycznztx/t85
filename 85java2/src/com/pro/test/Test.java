package com.pro.test;

import com.pro.domain.JavaTea;
import com.pro.domain.Person;

public class Test {

	/**
	 * @param args
	 * 为什么创建复杂类型？也称为自定义类型。
	 * 类的属性加不加访问修饰符，有什么访问限制？
	 * 类的安全性？属性私有化
	 * 封装：将属性私有化，通过公共方法来访问。
	 */
	public static void main(String[] args) {
		
		JavaTea jt=new JavaTea();
		jt.name="李四";
		jt.jk();
		
		
		

/*		int i=10;
		
		Person p=new Person();
//		p.name="张三";
//		p.age=-22;
//		p.sex="男";
//		p.height=200;
		p.setName("张三");
		p.setAge(10);
		
		int age=p.getAge();
		System.out.println(age);*/
	}

}
