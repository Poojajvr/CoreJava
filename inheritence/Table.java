package com.xworkz.inheritance.dtowood;

public class Table extends Wood{
	public String woodtype="oak";
	public int price=10000;
	public String color="red";
	public byte legs=4;
	public byte width=8;
	
	public String eat() {
		return "food";
	}
	public String write() {
		return "homework";
	}
	public String sit() {
		return "guest";
	}
	public String store() {
		return "shoes";
	}
	public String keep() {
		return "books";
	}

}
