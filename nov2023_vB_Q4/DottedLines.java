package nov2023_vB_Q4;

public class DottedLines implements lDrawableLine {
	
	private static DottedLines Dtl;
	private DottedLines() {}
	
	public static DottedLines getinstence() {
		if(Dtl==null) {
			Dtl=new DottedLines();
		}
		return Dtl; 
	}
	
	@Override
	public void drawLines(String robotType) {
		System.out.println("Draw Dotted Line on clothes by "+ robotType );

	}

}
