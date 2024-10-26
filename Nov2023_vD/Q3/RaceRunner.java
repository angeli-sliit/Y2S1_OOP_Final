package Q3;

public class RaceRunner {

	public static void main(String[] args) {
		
		Thread bThread = new Thread(new Bike());
		Thread cThread = new Thread(new Car());
		
		cThread.start();
		try {
			cThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		bThread.start();
		try {
			bThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


class Car extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Car is racing");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


class Bike extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Bike is racing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
