package Q3;

public class TestThread {

	public static void main(String[] args) {
		Object lock = new Object();
		Thread plusThread = new Thread(new PlusThread(lock,2,10));
		Thread multiplyThread = new Thread(new MultiplyThread(lock,2,10));
		
		
		multiplyThread.start();
		plusThread.start();

	}

}



class PlusThread implements Runnable {
	Object lock;
	int stat;
	int range;
	
	
	public PlusThread(Object lock, int stat, int range) {
		super();
		this.lock = lock;
		this.stat = stat;
		this.range = range;
	}



	public void addNumbers(Object lock, int stat, int range) {
		synchronized (lock) {
			for(int i=stat; i<=range; i++) {
				System.out.println(Thread.currentThread().getName() + " => " + i + " + " + i + " = "+ (i+i));
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
	@Override
	public void run() {
		addNumbers(lock, stat, range);
	}

}




class MultiplyThread implements Runnable {
	Object lock;
	int stat;
	int range;
	
	
	public MultiplyThread(Object lock, int stat, int range) {
		super();
		this.lock = lock;
		this.stat = stat;
		this.range = range;
	}



	public void addNumbers(Object lock, int stat, int range) {
		synchronized (lock) {
			for(int i=stat; i<=range; i++) {
				System.out.println(Thread.currentThread().getName() + " => " + i + " x " + i + " = "+ (i*i));
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
	@Override
	public void run() {
		addNumbers(lock, stat, range);
	}

}

