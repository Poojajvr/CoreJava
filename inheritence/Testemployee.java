package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoemployee.Developer;

public class Testemployee {
	public static void main(String []args) {
		
		Developer developer= new Developer();
		System.out.println(developer.name);
		System.out.println(developer.salary);
		System.out.println(developer.id);
		System.out.println(developer.companyname);
		System.out.println(developer.email);
		
		String str=developer.work();
		System.out.println(str);
		
		String str2=developer.eat();
		System.out.println(str2);
		
		String str3=developer.walk();
		System.out.println(str3);
		
		String str4=developer.Assingments();
		System.out.println(str4);
		
		boolean str5=developer.security();
		System.out.println(str5);
		
		System.out.println(developer.name);
		System.out.println(developer.id);
		System.out.println(developer.salary);
		System.out.println(developer.contact);
		System.out.println(developer.email);
		
		String str6=developer.work();
		System.out.println(str6);
		
		String str7=developer.eat();
		System.out.println(str7);
		
		String str8=developer.walk();
		System.out.println(str8);
		
		String str9=developer.Assingments();
		System.out.println(str9);
		
		boolean stri=developer.security();
		System.out.println(stri);

		
	}

}
