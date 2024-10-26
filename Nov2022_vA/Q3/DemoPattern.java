package Q3;

import java.util.Scanner;

public class DemoPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Object lock = new Object();
		
		System.out.print("Enter Pattern 1 = ");
		String p1 = scan.next();
		
		System.out.print("Enter Pattern 2 = ");
		String p2 = scan.next();
		
		System.out.print("Enter count = ");
		int count = scan.nextInt();
		
		Thread t1 = new Thread(new Pattern01(p1,count,lock),"pattern_01");
		Thread t2 = new Thread(new Pattern02(p2,count,lock),"pattern_02");
		
		System.out.println("==========Thread start printing pattern==========");
		
		
		t2.start();
		t1.start();
		scan.close();

	}

}




class Pattern01 extends Thread{
	Object lock;
	String p;
	int c;
	public Pattern01(String p, int c, Object lock) {
		this.p=p;
		this.c=c;
		this.lock=lock;
	}
	@Override
	public void run() {
		synchronized (lock) {
			for(int i = 1; i<=c; i++) {
				System.out.print(Thread.currentThread().getName()+" = ");
				for(int j =0; j<c+2-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<i; k++) {
					System.out.print(p+" ");
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
	String p;
	int c;
	public Pattern02(String p, int c, Object lock) {
		this.p=p;
		this.c=c;
		this.lock=lock;
	}
	@Override
	public void run() {
		synchronized (lock) {
			for(int i = 1; i<=c; i++) {
				System.out.print(Thread.currentThread().getName()+" = ");
				for(int j =0; j<c+2-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<i; k++) {
					System.out.print(p+" ");
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


