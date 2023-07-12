package com.nt.java8;

import java.util.function.Predicate;

public class predicatedemo2 {
	
	public static void main(String[] args) {
		
		String[] s= {"karu","yamu","chitiluuu","karthik","prasanth","nagaswetha"};
		
		//Predicate<String> p1=s1->s1.length()>5;
		Predicate<String> p1=s1->s1.length()%2==0;
		//eve or not
		for(String s1:s) {
			if (p1.test(s1)) {
				System.out.println(s1);
				
			}
		}
		
		//System.out.println("the answer is  "+t1.test(15));
		
	}
	
	
	

}
