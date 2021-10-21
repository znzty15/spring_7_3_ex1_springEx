package com.javayongju.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름 : "+student1.getName());
		System.out.println("나이 : "+student1.getAge());
		System.out.println("------------------------------------------");
		
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("홍길자");
		student2.setAge(50);
		
		
		System.out.println("이름 : "+student2.getName());
		System.out.println("나이 : "+student2.getAge());
		System.out.println("-------------------------------------------");
		
		if(student1.equals(student2)) {
			System.out.println("[student1과 student2는 같은 객체를 참조하고있습니다.]");
		} else {
			System.out.println("[student1과 student2는 다른 객체를 참조하고있습니다]");
		}
	}

}
