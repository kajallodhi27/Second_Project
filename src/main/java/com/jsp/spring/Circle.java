package com.jsp.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Circle {
	
	public void getArea() {
 System.out.println("Area of the circle 3.147*r*r:");
}
}