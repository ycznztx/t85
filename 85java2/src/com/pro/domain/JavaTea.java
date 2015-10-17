package com.pro.domain;

//继承的单根性。
//继承：根据现有类派生出新类的机制。新类中
//具有基类的属性和方法。
public class JavaTea extends Tea{
		
	//重写：将父类中的方法，在子类中重新写一下。
	//注意：子类对象会调用自已的方法。访问修饰符必须大于或等于父类的
	//访问修饰符
	public void jk() {
		System.out.println(" jk...");
		super.jk();
	}
}
