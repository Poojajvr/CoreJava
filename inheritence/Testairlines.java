package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoairlines.Indigo;

public class Testairlines {
	public static void main(String []args) {
		
		Indigo indigo= new Indigo();
		System.out.println(indigo.noofpassengers);
		System.out.println(indigo. nooftickets);
		System.out.println(indigo.typesofairlines);
		System.out.println(indigo.name);
		System.out.println(indigo. founded);
		
		String str= indigo.fly();
		System.out.println(str);
		
		String str1= indigo.carry();
		System.out.println(str1);
		
		String str2= indigo.travel();
		System.out.println(str2);
		
		boolean str3= indigo.saftey();
		System.out.println(str3);
		
		boolean str4= indigo.security();
		System.out.println(str4);
		
		System.out.println(indigo.noofpassengers);
		System.out.println(indigo. typesoftickets);
		System.out.println(indigo.CEO);
		System.out.println(indigo.name);
		System.out.println(indigo.headquaters);
		
		String str5= indigo.fly();
		System.out.println(str5);
		
		String str6= indigo.carry();
		System.out.println(str6);
		
		String str7= indigo.travel();
		System.out.println(str7);
		
		boolean str8= indigo.saftey();
		System.out.println(str8);
		
		boolean str9= indigo.security();
		System.out.println(str9);
		
		
		
		
		
		
		

		
	}

}
