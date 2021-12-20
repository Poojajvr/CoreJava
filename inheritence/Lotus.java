package com.xworkz.inheritance.dtoflower;

public class Lotus {
	
	public String type="Flower";
	public String color="pink";
	public byte price=10;
	public byte petals=20;
	public boolean seasonal=true;
	
	public String Type(String type) {
		this.type=type;
		return type;
	}
	
	public String Color (String color) {
		this.color=color;
		return color;
	}
	
	public byte Price(byte price) {
		this.price=price;
		return price;
	}
	
	public byte Petals(byte petals) {
		this.petals=petals;
		return petals;
	}
	
    public boolean Seasonal(boolean seasonal) {
	    this.seasonal=seasonal;
	    return seasonal;
}

}
