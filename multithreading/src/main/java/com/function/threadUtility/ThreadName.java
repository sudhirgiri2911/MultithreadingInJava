package com.function.threadUtility;

public class ThreadName implements Runnable{

	public void run() {
		System.out.println("Thread is running ");
	}
	
	public static void main(String[] args) {
		
		ThreadName runnable = new ThreadName();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
		System.out.println("Thread t1 -> " + t1.getName() + " and its priority is " + t1.getPriority());
		System.out.println("Thread t2 -> " + t2.getName() + " and its priority is " + t2.getPriority());

	}

}
