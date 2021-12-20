package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoforest.Nagarahole;

public class Testforest {
	public static void main(String []args) {
		
		Nagarahole forest= new Nagarahole();
		System.out.println(forest.name);
		System.out.println(forest.location);
		System.out.println(forest.state);
		System.out.println(forest.opened);
		System.out.println(forest.ticket);
		
		String str=forest.rain();
		System.out.println(str);
		
		String str2=forest.preventsoilerosion();
		System.out.println(str2);
		
		String str3=forest.oxygen();
		System.out.println(str3);
		
		String str4=forest.life();
		System.out.println(str4);
		
		String str5=forest.food();
		System.out.println(str5);
		
		System.out.println(forest.location);
		System.out.println(forest.founded);
		System.out.println(forest.price);
		System.out.println(forest.area);
		System.out.println(forest.contact);
		
		String str6=forest.rain();
		System.out.println(str6);
		
		String str7=forest.preventsoilerosion();
		System.out.println(str7);
		
		String str8=forest.oxygen();
		System.out.println(str8);
		
		String str9=forest.life();
		System.out.println(str9);
		
		String stri=forest.food();
		System.out.println(stri);


	}
	

}
