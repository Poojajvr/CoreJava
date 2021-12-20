package com.xworkz.inheritance.dtoairlines;

public class Indigo extends Airlines {
	public int noofpassengers=100;
	public byte typesoftickets=2;
	public int founded=2005;
	public String CEO="Rono dutta";
	public String headquaters="gurugram";
	
	public String fly() {
		return "sky";
	}
	public String carry() {
		return "luggage";
	}
	public String travel() {
		return "countries";
	}
	public boolean saftey() {
		return true;
	}
	public boolean security() {
		return true;
	}


}
