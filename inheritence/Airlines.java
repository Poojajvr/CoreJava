package com.xworkz.inheritance.dtoairlines;

public class Airlines {
	public int noofpassengers=100;
	public byte nooftickets=2;
	public byte typesofairlines=3;
	public String name="Delta airlines";
	public int founded=1952;
	
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
