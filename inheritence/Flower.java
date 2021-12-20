package com.xworkz.inheritance.dtoflower;

public class Flower {
	public String name="Rose";
	public String color="Red";
	public byte price=20;
	public byte petals=15;
	public String shape="round";
	
	public String Name(String name) {
		this.name=name;
		return name;
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
	
    public String Shape(String shape) {
	  this.shape=shape;
	  return shape;
}
	
}
