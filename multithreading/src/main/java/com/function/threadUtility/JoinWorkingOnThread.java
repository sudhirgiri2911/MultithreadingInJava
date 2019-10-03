package com.function.threadUtility;

public class JoinWorkingOnThread implements Runnable{

	public static final int MAX_ITERATION_SIZE = 10;
	
	public void run() {
		for(int i = 0 ; i < MAX_ITERATION_SIZE ; i++) {
			System.out.print(i + " ");
			
			if(i==MAX_ITERATION_SIZE/2) {
				try {
				Thread.sleep(500);
				}catch(InterruptedException e) {
					System.out.println("Caught in exception");
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinWorkingOnThread runnable = new JoinWorkingOnThread();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println("Error occured while joining threads");
		}
		
		t2.start();
		t3.start();
		
	}

}
