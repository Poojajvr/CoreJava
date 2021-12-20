package com.xworkz.inheritance.dtotrain;

public class Metro extends Train{
	public String type="Electric train";
	public byte topspeed=80;
	public byte nooflines=2;
	public String opened="24-12-2002";
	public short ticketprice=500;
	
	
	public boolean safety() {
		return true;
	}
	public short voltsupply() {
		return 250;
	}
	public String electricdoors() {
		return "open";
	}
	public int passengerscapacity() {
		return 3000;
	}
	public String move() {
		return "fast";
	}

}
