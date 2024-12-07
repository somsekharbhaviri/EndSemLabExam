package com.klef.jfsd.exam.controllerDI;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientController 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("****Dependency Injection using Constructor method****");
		Employee f=(Employee)context.getBean("employeebean");
		
		System.out.println(f.toString());

		context.close();
	}

}
