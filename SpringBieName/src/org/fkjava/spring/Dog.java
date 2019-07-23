package org.fkjava.spring;

public class Dog {

	private String name;
	private Integer age;
	
	public void setName(String name) {
		System.out.println("调用setName方法");
		this.name = name;
	}
	public Dog(Integer age) {
		super();
		System.out.println("调用age带参数的构造器");
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}
