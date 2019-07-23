package test;

import org.fkjava.spring.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//dzw
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Dog dog = (Dog)ctx.getBean("*_*");
		System.out.println(dog);
	}
}
