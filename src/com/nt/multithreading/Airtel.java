package com.nt.multithreading;

public class Airtel implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println("Airtel sim");
		}
		System.out.println("------------------------------");

	}

}
