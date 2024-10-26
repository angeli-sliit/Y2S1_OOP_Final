package nov2023_vB_Q3;

public class RaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread threadCar = new Thread(new Car());
		Thread threadBike = new Thread(new Bike());
		
		threadCar.start();
		try {
			threadCar.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadBike.start();
	}

}
