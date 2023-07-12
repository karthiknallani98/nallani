package com.nt.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Testfunctiondemo {

	public static void main(String[] args) {

		Function<student, String> f = s -> {

			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[dictinction]";
			else if (marks >= 60)
				grade = "B[first class]";
			else if (marks >= 50)
				grade = "c[second class]";
			else if (marks >= 35)
				grade = "d[third class]";
			else
				grade = "E[failed]";
			return grade;

		};
		Predicate<student> p = s -> s.marks >= 60;

		student[] s = { new student("karthik", 100), new student("nallani ", 65), new student("swetha ", 55),
				new student("yamu ", 95), new student("karuuuu ", 45), };

		Consumer<student> c = s1 -> {
			System.out.println("student name: " + s1.name);
			System.out.println("student marks: " + s1.marks);
			System.out.println("student Grade: " + f.apply(s1));
			System.out.println("----------------------------------------------------------------------------------");
		};

		for (student s1 : s) {
			if (p.test(s1)) {
				c.accept(s1);
			}

		}

	}

}
