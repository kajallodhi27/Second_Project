package com.jsp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext ac =new AnnotationConfigApplicationContext(App.class);
		
		Shape shape= ac.getBean(Shape.class);
		
		Circle circle1=ac.getBean(Circle.class);
		Circle circle2= ac.getBean(Circle.class);

	  System.out.println(circle1);
	  System.out.println(circle2);



	}
}
