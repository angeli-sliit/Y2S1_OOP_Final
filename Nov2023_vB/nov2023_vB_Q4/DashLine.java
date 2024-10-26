package nov2023_vB_Q4;

public class DashLine implements lDrawableLine {
	private static DashLine Dl;
	private DashLine() {}
	
	public static DashLine getinstence() {
		if(Dl==null) {
			Dl=new DashLine();
		}
		return Dl; 
	}
	@Override
	public void drawLines(String robotType) {
		System.out.println("Draw Dash Line on clothes by "+ robotType );

	}

}
