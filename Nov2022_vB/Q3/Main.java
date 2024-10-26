package Q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Object lock =new Object();
		
		System.out.print("Enter Pattern 1 = ");
		String p1 = scan.next();
		
		System.out.print("Enter Pattern 2 = ");
		String p2 = scan.next();
		
		System.out.print("Enter Count     = ");
		int count = scan.nextInt();
		
		Thread thread1 = new Thread(new Pattern01(lock, p1, count),"Pattern 01 Thread");
		Thread thread2 = new Thread(new Pattern01(lock, p2, count),"Pattern 02 Thread");
		
		System.out.println("==========Threads Starts Printing Patterns==========");
		
		thread1.start();
		thread2.start();
		
		scan.close();
	}
}


class Pattern01 extends Thread{
	Object lock;
	String pattern01;
	int count;
	int i,j,k;
	
	public Pattern01(Object lock,String pattern01, int count) {
		super();
		this.pattern01 = pattern01;
		this.count = count;
		this.lock=lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			for(i=count; i>=0; i--) {
				System.out.print(Thread.currentThread().getName() + " = ");
				for(j=0; j<count+2-i; j++) {
					System.out.print(" ");
				}
				for(k=0; k<=i; k++) {
					System.out.print(pattern01 + " ");
				}
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

	}
}


class Pattern02 extends Thread{
	
	Object lock;
	String pattern02;
	int count;
	int i,j,k;
	
	public Pattern02(Object lock,String pattern01, int count) {
		super();
		this.pattern02 = pattern01;
		this.count = count;
		this.lock=lock;
	}
	@Override
	public void run() {
	synchronized (lock) {
		for(i=count; i>=0; i--) {
			System.out.print(Thread.currentThread().getName() + " = ");
			for(j=0; j<count+2-i; j++) {
				System.out.print(" ");
			}
			for(k=0; k<=count; k--) {
				System.out.print(pattern02 + " ");
			}
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lock.notify();
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
}

