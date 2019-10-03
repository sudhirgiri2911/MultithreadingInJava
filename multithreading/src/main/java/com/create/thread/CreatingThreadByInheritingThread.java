package com.create.thread;

public class CreatingThreadByInheritingThread extends Thread{
	
	//Need to have own implementation of run method of extending class
	public void run() {
		System.out.println("This is run by new spawned thread");
	}
	
	public static void main(String[] args) {
		CreatingThreadByInheritingThread t1 = new CreatingThreadByInheritingThread();
		
		/*When you call start method of run class, it will in turn make a call to run()
		 method of this running class.
		 */
		t1.start();
	}
	
}

