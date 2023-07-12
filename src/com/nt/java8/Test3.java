package com.nt.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test3 {
	public static void main(String[] args) {

		/*
		 * ArrayList<Employee2> arrl=new ArrayList<Employee2>(); arrl.add(new
		 * Employee2("karthik" , 2000)); arrl.add(new Employee2("nallani" , 8000));
		 * arrl.add(new Employee2("yamukarthik" ,1000)); arrl.add(new Employee2("karuuu"
		 * , 7000)); arrl.add(new Employee2("rambabu" , 2000)); arrl.add(new
		 * Employee2("sweee" , 2700));
		 * 
		 * Predicate<Employee2> p=e1->e1.salary>5000;
		 * 
		 * for (Employee2 e1 : arrl) {
		 * 
		 * if (p.test(e1)) { System.out.println(e1.name+"  "+e1.salary);
		 * 
		 * }
		 */

		int[] x = { 0, 2, 5, 9, 6, 10, 12, 16, 18, 20, 23, 22 };
		// and(),or(),negate();;;;;
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;

		System.out.println("The numbers  even and >10 are::");

		for (int x1 : x) {
			if (p1.and(p2).test(x1)) {

				System.out.println(x1);

			}

		}

	}

}
