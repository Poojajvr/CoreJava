package com.xworkz.inheritance.dtofruit;

public class Banana extends Fruit {
	public String type="Fruit";
	public String color="yellow";
	public byte price=50;
	public String taste="sweet";
	public boolean seasonal=false;
	
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
	
	public String Taste(String taste) {
		this.taste=taste;
		return taste;
	}
	
    public boolean Seasonal(boolean seasonal) {
	    this.seasonal=seasonal;
	    return seasonal;
}
	

}


