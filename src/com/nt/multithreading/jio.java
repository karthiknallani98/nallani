package com.nt.multithreading;

public class jio  implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			Thread.yield();

			System.out.println("jio sim");
		}
		System.out.println("------------------------------");
	}

}
