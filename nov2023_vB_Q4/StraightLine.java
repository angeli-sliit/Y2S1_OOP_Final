package nov2023_vB_Q4;

public class StraightLine implements lDrawableLine {
	private static StraightLine Sl;
	private StraightLine() {}
	
	public static StraightLine getinstence() {
		if(Sl==null) {
			Sl=new StraightLine();
		}
		return Sl; 
	}
	@Override
	public void drawLines(String robotType) {
		System.out.println("Draw Straight Line on clothes by "+ robotType );

	}

}
