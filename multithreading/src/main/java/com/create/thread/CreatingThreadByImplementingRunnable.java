package com.create.thread;

public class CreatingThreadByImplementingRunnable implements Runnable {

	public void run() {
		System.out.println("Thread is running ");
	}
	
	public static void main(String[] args) {
		
		CreatingThreadByImplementingRunnable runnableThread = new CreatingThreadByImplementingRunnable();
		Thread t1 = new Thread(runnableThread);
		
		t1.start();
	}

}
