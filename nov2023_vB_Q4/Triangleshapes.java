package nov2023_vB_Q4;

public class Triangleshapes implements lDrawableshapes {
	
	private static Triangleshapes Tl;
	private Triangleshapes() {}
	
	public static Triangleshapes getinstence() {
		if(Tl==null) {
			Tl=new Triangleshapes();
		}
		return Tl; 
	}
	@Override
	public void drawshapes(String robotType) {
		System.out.println("Draw Triangle on clothes by "+ robotType);

	}

}
