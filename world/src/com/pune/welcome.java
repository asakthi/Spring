package com.pune;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.erode.abc;
import com.erode.hello;

public class welcome {

	public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("com/bang/application-context.xml");
         hello h = (hello) context.getBean("Hello");
         abc a = (abc) context.getBean("H"
         		+ "ell");
         System.out.println(h.hel());
         a.setName("hcl");      
     
         a.setName1("company");
         a.setName2("tech");
         //System.out.println(a.toString());
         System.out.println(a.ay());
         
	}

}
