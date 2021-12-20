package com.xworkz.inheritance.dtoBird;

public class Peacock extends Brid {
          public String kingdom="Animalia";
          public byte wingsspan=10;
          public String color="Green";
          public String skintype="Feathers";
          public byte weight=6;
          
          public Peacock() {
        	  System.out.println("peacock is a national bird");
          }
          
          public String kingdom(String kingdom) {
        	  this.kingdom=kingdom;
        	  return kingdom;
          }
          
          public byte wingsspan(byte wingsspan) {
        	  this.wingsspan=wingsspan;
        	  return wingsspan;
          }
          
          public String color(String color) {
        	  this.color=color;
        	  return color;
          }
          
          public String skintype(String skintype) {
        	  this.skintype=skintype;
        	  return skintype;
          }
}
