package June2023_vB_Q4;

public class MissileController {
	
	private static MissileController mc;
	
	private MissileOperation op01;
	private MissileOperation op02;
	
	private MissileController() {}
	
	public static MissileController getInstence() {
		if(mc == null) {
			mc =new MissileController();
			System.out.println("Initialize Missile Controller.....");	
		}
		return mc;
	}
	
	public void setOperattion( MissileOperation launch,  MissileOperation blast) {
		this.op01=launch;
		this.op02=blast;
	}

	 
	 public void performLaunching(String start) {
		 op01.initiateoperation(start);
	 }
	 
	 public void performBlasting(String end) {
		 op02.initiateoperation(end);
	 }
}
