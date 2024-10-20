package nov2023_vB_Q4;

public class Circleshapes implements lDrawableshapes {

	private static Circleshapes Sh;
	private Circleshapes() {}
	
	public static Circleshapes getinstence() {
		if(Sh==null) {
			Sh=new Circleshapes();
		}
		return Sh; 
	}
	
	@Override
	public void drawshapes(String robotType) {
		System.out.println("Draw Circle on clothes by "+ robotType);

	}

}
