package com.xworkz.inheritance;

import com.xworkz.inheritance.dtophone.Vivo;

public class Testphone {
	
	public static void main(String []args) {
		
		Vivo phone= new Vivo();
		System.out.println(phone.name);
		System.out.println(phone.color);
		System.out.println(phone.price);
		System.out.println(phone.series);
		System.out.println(phone.rom);
		
	    String str=phone.ringing();
	    System.out.println(str);
	    
	    String str1=phone.play();
	    System.out.println(str1);
	    
	    String str2=phone.shopping();
	    System.out.println(str2);
	    
	    String str3=phone.talk();
	    System.out.println(str3);
	    
	    String str4=phone.chating();
	    System.out.println(str4);
	    
	    System.out.println(phone.series);
		System.out.println(phone.color);
		System.out.println(phone.rom);
		System.out.println(phone.ram);
		System.out.println(phone.model);
		
		String str5=phone.ringing();
	    System.out.println(str5);
	    
	    String str6=phone.play();
	    System.out.println(str6);
	    
	    String str7=phone.towatch();
	    System.out.println(str7);
	    
	    String str8=phone.talk();
	    System.out.println(str8);
	    
	    String str9=phone.alarm();
	    System.out.println(str9);
	    

	
	
	
	
	
	
	
	}
	

}
