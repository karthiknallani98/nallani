package com.nt.java8;

import java.util.function.Predicate;

public class predicatedemo {
	
	public static void main(String[] args) {
		Predicate<Integer> t1=i->i%2==0;
		System.out.println("the answer is  "+t1.test(10));
		System.out.println("the answer is  "+t1.test(15));
		
	}

}
