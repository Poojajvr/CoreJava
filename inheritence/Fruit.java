package com.xworkz.inheritance.dtofruit;

public class Fruit {
	public String name="Apple";
	public String color="Red";
	public short price=200;
	public String taste="Sweet";
	public String shape="round";
	
	public String Name(String name) {
		this.name=name;
		return name;
	}
	
	public String Color (String color) {
		this.color=color;
		return color;
	}
	
	public short Price(short price) {
		this.price=price;
		return price;
	}
	
	public String Taste(String taste) {
		this.taste=taste;
		return taste;
	}
	
public String Shape(String shape) {
	this.shape=shape;
	return shape;
}
	

}
