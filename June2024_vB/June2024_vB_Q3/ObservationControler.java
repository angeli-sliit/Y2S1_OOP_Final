package June2024_vB_Q3;

public class ObservationControler {
	public static void main(String[] args) throws InterruptedException {
		Telescope t = new Telescope();
		Satallite s = new Satallite();
		
		t.start();
		t.join();
		System.out.println();
		s.start();
		s.join();
		
		
		Telescope t1 = new Telescope();
		Satallite s1 = new Satallite();
		System.out.println();		
		System.out.println("Both observation being again simulteneosly....");
		t1.start();
		s1.start();


		
		
		
	}
}


class Telescope extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Telescope is observing");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class Satallite extends Thread{
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Satallite is observing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
