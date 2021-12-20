package com.xworkz.inheritance.dtophone;

public class Phone {
	public String name="oneplus";
	public int price=35000;
	public String color="black";
	public String series="t9";
	public byte rom=64;
	
	public String ringing() {
		return "phone";
	}
	public String play() {
		return "games";
	}
	public String shopping() {
		return "clothes";
	}
	public String talk() {
		return "parents";
	}
	public String chating() {
		return "friends";
	}

}
