package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoflower.Flower;
import com.xworkz.inheritance.dtoflower.Lotus;

public class Testflower {
	public static void main(String []args) {
		Flower flower= new Flower();
		 System.out.println(flower.name);
		 System.out.println(flower.color);
		 System.out.println(flower.price);
		 System.out.println(flower.petals);
		 System.out.println(flower.shape);
		 
		 
		 Lotus flower1= new Lotus();
		 
				 
		 System.out.println(flower1.type);
		 System.out.println(flower1.color);
		 System.out.println(flower1.price);
		 System.out.println(flower1.petals);
		 System.out.println(flower1.seasonal);

		 
		 


		
	}
}
