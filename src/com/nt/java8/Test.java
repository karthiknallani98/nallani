package com.nt.java8;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * Employee e = new Employee("karthik", 1234); System.out.println(e);
		 */
		
		ArrayList<Employee> l=new ArrayList<>();
		l.add(new Employee("karu", 256));
		l.add(new Employee("swe", 156));
		l.add(new Employee("yams", 56));
		l.add(new Employee("chiti", 26));
		System.out.println(l);
		//Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		
		
		System.out.println(l);
		
		
		// ()->System.out.println("hello");
	}
}
