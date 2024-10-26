package Q3;


public class EvenOddPrinter {
	private static final int MAX_NUM = 20;
	private static volatile int netNum = 1;
	private static final Object lock = new Object();
	
	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenRunnable(),"evenThread");
		Thread oddThread = new Thread(new OddRunnable(),"OddThread");
		
		oddThread.start();
		evenThread.start();
	}
	
	
	static class EvenRunnable implements Runnable{
		@Override
		public void run() {
			synchronized (lock) {
				for(int i=netNum; i<=MAX_NUM; i++ ) {
					if(i%2 == 0) {
						System.out.println(Thread.currentThread().getName()+" : " + i);
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
	}

	static class OddRunnable extends Thread{
		@Override
		public void run() {
			synchronized (lock) {
				for(int i=netNum; i<=MAX_NUM; i++ ) {
					if(i%2 == 1) {
						System.out.println(Thread.currentThread().getName()+" : " +  i);
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
	}
}


