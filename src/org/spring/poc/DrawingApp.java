package org.spring.poc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();
	}
}
