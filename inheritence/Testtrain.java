package com.xworkz.inheritance;

import com.xworkz.inheritance.dtotrain.Metro;

public class Testtrain {
	public static void main(String []args) {
		
		Metro metro= new Metro();
		
		System.out.println(metro.color);
		System.out.println(metro.name);
		System.out.println(metro.bogie);
		System.out.println(metro.frequency);
		System.out.println(metro.passengers);
		
		String str=metro.move();
		System.out.println(str);
		
		String str1=metro.use();
		System.out.println(str1);
		
		String str2=metro.stop();
		System.out.println(str2);
		
		String str3=metro.sound();
		System.out.println(str3);
		
		System.out.println(metro.type);
		System.out.println(metro.topspeed);
		System.out.println(metro.nooflines);
		System.out.println(metro.opened);
		System.out.println(metro.ticketprice);
		
		boolean str4=metro.safety();
		System.out.println(str4);
		
		short str5=metro.voltsupply();
		System.out.println(str5);
		
		String str6=metro.electricdoors();
		System.out.println(str6);
		
		int str7=metro.passengerscapacity();
		System.out.println(str7);
		
		String str8=metro.move();
		System.out.println(str8);
	}

}
