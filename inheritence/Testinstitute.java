package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoinstitute.Xworkz;

public class Testinstitute {
	public static void main(String []args) {
		
		Xworkz work= new Xworkz();
		
		System.out.println(work.name);
		System.out.println(work.students);
		System.out.println(work.location);
		System.out.println(work.CEO);
		System.out.println(work.nooftrainers);
		
		String str=work.assingments();
		System.out.println(str);
		
		String str1=work.activites();
		System.out.println(str1);
		
		String str2=work.goodteaching();
		System.out.println(str2);
		
		String str3=work.provideknowledge();
		System.out.println(str3);
		
		boolean str4=work.notes();
		System.out.println(str4);
		
		System.out.println(work.students);
		System.out.println(work.CEO);
		System.out.println(work.HR);
		System.out.println(work.noofbranchs);
		System.out.println(work.name);
		
		String str5=work.assingments();
		System.out.println(str5);
		
		String str6=work.activites();
		System.out.println(str6);
		
		String str7=work.goodteaching();
		System.out.println(str7);
		
		String str8=work.provideknowledge();
		System.out.println(str8);
		
		boolean str9=work.notes();
		System.out.println(str9);
		
		
		
		
		
		
	}

}
