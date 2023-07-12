package com.nt.multithreading;

import java.util.concurrent.ExecutorService;

public class PrintJob implements Runnable {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println((name + "....Job Started By Thread:" + Thread.currentThread().getName()));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println((name + "....Job Completed By Thread:" + Thread.currentThread().getName()));
	}
}