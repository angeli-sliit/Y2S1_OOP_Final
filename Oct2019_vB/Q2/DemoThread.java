package Q2;

public class DemoThread {

	public static void main(String[] args) {
		DemoThread demoThread = new DemoThread();
		Thread addNumbers = new Thread(new AddNumbers(demoThread,10,20),"ADD");
		Thread multiplyNumbers = new Thread(new MultiplyNumbers(demoThread,10,20),"MUL");
		addNumbers.start();
		multiplyNumbers.start();
	}
	
	static class AddNumbers implements Runnable{
		DemoThread dThread;
		int start;
		int max;
		public AddNumbers(DemoThread dThread, int start, int max) {
			this.dThread = dThread;
			this.start = start;
			this.max = max;
		}
		
		
		public void addNumbers(DemoThread demoThread, int begin, int end){
			synchronized(dThread) {
				for(int i=begin; i<=end; i++) {
					System.out.println(Thread.currentThread().getName()+" => " + i + "(+)" + i + " = " + (i+i));
					dThread.notify();

					try {
						Thread.sleep(1000);
						dThread.wait();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				dThread.notify();
			}
		} 
		
		
		
		@Override
		public void run() {
			addNumbers(dThread, start, max);
		}
	}
	
	static class MultiplyNumbers implements Runnable{
		DemoThread dThread;
		int start;
		int max;
		public MultiplyNumbers(DemoThread dThread, int start, int max) {
			this.dThread = dThread;
			this.start = start;
			this.max = max;
		}
		
		public void multiplyNumbers(DemoThread demoThread, int begin, int end) {
			synchronized (dThread) {
				for(int i=begin; i<=end; i++ ) {
					System.out.println(Thread.currentThread().getName()+" => " + i + "(x)" + i + " = " + (i*i));
					dThread.notify();

					try {
						Thread.sleep(1000);
						dThread.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				dThread.notify();
			}
			
		}
		@Override
		public void run() {
			multiplyNumbers(dThread, start, max);
			
		}
	}
}

