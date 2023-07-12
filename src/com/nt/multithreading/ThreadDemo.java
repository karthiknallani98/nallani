package com.nt.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		/*
		 * MyThread t = new MyThread();
		 * 
		 * t.start(); for (int i = 0; i < 5; i++) { System.out.println("main thread"); }
		 */

		idea I = new idea();
		Airtel A = new Airtel();
		jio J = new jio();

		Thread t = new Thread(I);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		System.out.println("------------------------------------------------------------");
		Thread t1 = new Thread(A);
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		System.out.println("------------------------------------------------------------");
		Thread t3 = new Thread(A);
		t3.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		System.out.println("------------------------------------------------------------");

	}
}