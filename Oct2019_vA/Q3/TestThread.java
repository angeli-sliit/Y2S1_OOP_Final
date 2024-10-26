package Q3;

public class TestThread {
	public static void main(String[] args) {
		Object lock = new Object();
		Thread plusThread = new Thread(new PlusThread(lock, 2,10));
		Thread multiplyThread = new Thread(new MultiplyThread(lock, 2,10));
		
		multiplyThread.start();
		plusThread.start();
		
	}

}



class PlusThread extends  Thread {
	Object lock2;
	int Start;
	int Range;
	public PlusThread(Object lock, int Start, int Range) {
		  this.Start = Start;
	      this.Range = Range;
	      this.lock2 = lock;
	}
	public void addNumber(Object lock, int Start, int Range) {
		for(int i=Start; i<=Range; i++) {
			synchronized (lock) {
				try {
					System.out.println(Thread.currentThread().getName() + " => " + i + " + " + i + " = " + (i+i) );
					lock.notifyAll();
					lock.wait();
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
		synchronized (lock) {
			lock.notify();
		}
	}
	
	@Override
	public void run() {
		addNumber(lock2,Start,Range);
	}
	
}


class MultiplyThread extends Thread {
	Object lock;
	int Start;
	int Range;
	public MultiplyThread(Object lock2, int Start, int Range) {
		  this.Start = Start;
	      this.Range = Range;
	      this.lock = lock2;
	}
	
	public void  multiplyNumbers(Object lock, int start, int range) {
		for(int i=start; i<=range; i++) {
			synchronized (lock) {
				try {
					System.out.println(Thread.currentThread().getName() +" => " + i + " * " + i + " = " + i * i );
					lock.notifyAll();
					lock.wait();
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		synchronized (lock) {
			lock.notify();
		}
	}
	
	public void run() {
		multiplyNumbers(lock,Start,Range);
	}

}