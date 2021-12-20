package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoBird.Brid;
import com.xworkz.inheritance.dtoBird.Peacock;

public class Testbird {
	
	public static void main(String []args) {
		
		Brid bird= new Brid();
		 System.out.println(bird.color);
		 System.out.println(bird.wings);
		 System.out.println(bird.species);
		 System.out.println(bird.eggs);
		 System.out.println(bird.teeth);
		 
		 
		 Peacock cock= new Peacock();
		 System.out.println(cock.color);
		 System.out.println(cock.wings);
		 System.out.println(cock.species);
		 System.out.println(cock.eggs);
		 System.out.println(cock.teeth);
		 
		 System.out.println(cock.kingdom);
		 System.out.println(cock.wingsspan);
		 System.out.println(cock.color);
		 System.out.println(cock.skintype);
		 System.out.println(cock.weight);

		 
		 


		
	}

}
