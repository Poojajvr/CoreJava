package com.xworkz.inheritance;

import com.xworkz.inheritance.dtowood.Table;

public class Testwood {
	public static void main(String []args) {
		
		Table table= new Table();
		System.out.println(table.name);
		System.out.println(table.color);
		System.out.println(table.price);
		System.out.println(table.woodtype);
		System.out.println(table.founded);
		
		String str=table.use();
		System.out.println(str);
		
		String str2=table.tobuildhouse();
		System.out.println(str2);
		
		System.out.println(table.woodtype);
		System.out.println(table.price);
		System.out.println(table.color);
		System.out.println(table.legs);
		System.out.println(table.width);
		
		String str6=table.eat();
		System.out.println(str6);
		
		String str7=table.write();
		System.out.println(str7);
		
		String str8=table.sit();
		System.out.println(str8);
		
		String str9=table.store();
		System.out.println(str9);
		
		String stri=table.keep();
		System.out.println(stri);
		
	}
}
