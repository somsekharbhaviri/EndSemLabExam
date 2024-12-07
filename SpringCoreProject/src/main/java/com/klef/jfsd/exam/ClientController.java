package com.klef.jfsd.exam;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientController 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("****Dependency Injection using AutoWiring****");
		
		Course c=(Course)context.getBean("coursebean");
		System.out.println(c.toString());
		context.close();
		
	}

}
