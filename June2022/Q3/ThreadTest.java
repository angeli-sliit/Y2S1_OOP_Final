package Q3;

import java.util.ArrayList;

public class ThreadTest {
	public static void main(String[] args) {
		ArrayList<Integer> queue = new ArrayList<Integer>();
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
		System.out.println("Starting");
	}
}




class Producer extends Thread{
	
	ArrayList<Integer> queue;
	int i =10;
	public Producer(ArrayList<Integer> queue){
		this.queue=queue;
		
	}
	
	@Override
	public void run() {
		synchronized (queue) {
			while(true) {
				queue.add(i);
				System.out.println("Produser Started");
				System.out.println("Produser adding value = " + i + " to Queue ");
				i+=10;
				queue.notify();
				try {
					Thread.sleep(1000);
					queue.wait();
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
}


class Consumer extends Thread{
	
	ArrayList<Integer> queue;
	public Consumer(ArrayList<Integer> queue){
		this.queue=queue;
		
	}
	
	@Override
	public void run() {
		synchronized (queue) {
			while(true) {
				System.out.println("Consumer started");
				System.out.println("Consumer thread consumes " + queue.remove(0));
				System.out.println("Element in Queue = " + queue);
				queue.notify();
				try {
					Thread.sleep(1000);
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	
}