package com.xworkz.inheritance.dtoBird;

public class Brid {
	public String color="black";
	public byte wings=2;
	public int species=10000;
	public boolean eggs=true;
	public boolean teeth=false;
	
	public Brid() {
		System.out.println("Brid is beautifull");	
		}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public byte wings(byte wings) {
		this.wings=wings;
		return wings;
	}
	
	public int species(int species) {
		this.species=species;
		return species;
	}
	
	public boolean eggs(boolean eggs) {
		this.eggs=eggs;
		return eggs;
	}
	

}
