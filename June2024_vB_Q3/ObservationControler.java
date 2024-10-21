package June2024_vB_Q3;

public class ObservationControler {
	public static void main(String[] args) {
		Thread tThread = new Thread(new Telescope());
		Thread sThread = new Thread(new Satellite());
		
		tThread.start();
		try {
			tThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		sThread.start();
		try {
			sThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println();
		System.out.println("Both observations are again simultaneously");
		Thread tThread1 = new Thread(new Telescope());
		Thread sThread1 = new Thread(new Satellite());
		tThread1.start();
		sThread1.start();
		
	}
}
