package Q4;

public class MissileController {
	MissileOperation op1;
	MissileOperation op2;
	private static MissileController instence;
	
	public static MissileController getInstence() {
		if(instence==null) {
			instence=new MissileController();
			System.out.println("Initialize Missile Controller");
		}
		return instence;
	}
	public void setOperattion(MissileOperation launch, MissileOperation Blast) {
		op1=launch;
		op2=Blast;
	}
	public void performLaunching(String start) {
		op1.initiateOperation(start);
	}
	public void performBlasting(String end) {
		op2.initiateOperation(end);
	}
}
