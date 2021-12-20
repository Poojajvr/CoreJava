package com.xworkz.inheritance.dtophone;

public class Vivo extends Phone {
	public String color="gold";
	public String series="v9";
	public byte ram=4;
	public byte rom=64;
	public String model="vivo 1610";
	
	public String ringing() {
		return "phone";
	}
	public String play() {
		return "games";
	}
	public String towatch() {
		return "movies";
	}
	public String talk() {
		return "parents";
	}
	public String alarm() {
		return "wakeup";
	}

}	
	


