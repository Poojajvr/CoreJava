package com.xworkz.inheritance.dtotrain;

public class Train {
	public String color="brown";
	public String name="AC express";
	public byte bogie=10;
	public byte frequency=8;
	public int passengers=10000;
	
	public Train() {
		System.out.println("Train is moving fast");
		}
	public String move() {
		return "fast";
	}
		
   public String use() {
		return "one place to anothere";
	}
   public String stop() {
	   return "station";
   }
   public String sound() {
	   return "loudly";
   }
	
	
	}


