package June2024_vB_Q3;

public class Satellite implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Satellite is observing");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

