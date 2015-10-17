package com.pro.domain;

//继承的单根性。
//继承：根据现有类派生出新类的机制。新类中
//具有基类的属性和方法。
//构造函数：和类同名，无返回类型,new时被调用。作用：
//第一时间初始化对象。
//重载：根据参数类型，顺序，个数不同，而调用匹配的方法。
public class JavaTea extends Tea {

	public JavaTea() {
		System.out.println("java无参构造");
	}

	//	
	public JavaTea(String name) {
		super(name);// 只参写在第一行
		// this.name=name;
		System.out.println(name + " java一参构造");
	}

	public JavaTea(String name, int age) {

		System.out.println(name + " java二参构造" + age);
	}

	public JavaTea(int age,String name) {

		System.out.println(age + " java二参构造" + name);
	}

	// 重写：将父类中的方法，在子类中重新写一下。
	// 注意：子类对象会调用自已的方法。访问修饰符必须大于或等于父类的
	// 访问修饰符
	public void jk() {
		System.out.println(" jk...");
		super.jk();
	}
}
