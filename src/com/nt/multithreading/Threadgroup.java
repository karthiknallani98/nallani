package com.nt.multithreading;

public class Threadgroup {
	public static void main(String[] args) {
		String  t=Thread.currentThread().getThreadGroup().getName();
		System.out.println(t);
		String t1=Thread.currentThread().getThreadGroup().getParent().getName();
		System.out.println(t1);
		ThreadGroup pg = new ThreadGroup("Parent Group");
		System.out.println(pg.getParent().getName());
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		System.out.println(cg.getParent().getName());
	}

}
