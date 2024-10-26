package nov2023_vB_Q4;

public class Squareshapes implements lDrawableshapes {
	
	private static Squareshapes Ss;
	private Squareshapes() {}
	
	public static Squareshapes getinstence() {
		if(Ss==null) {
			Ss=new Squareshapes();
		}
		return Ss; 
	}
	
	@Override
	public void drawshapes(String robotType) {
		System.out.println("Draw Square on clothes by "+ robotType );

	}

}
