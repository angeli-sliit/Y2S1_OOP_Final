package June2023_vB_Q4;

public class HeatMissileSystem implements MissileSystem{
	
	private static HeatMissileSystem HMS;
	
	private HeatMissileSystem() {}
	
	public static HeatMissileSystem  getInstence() {
		if (HMS == null) {
			HMS = new HeatMissileSystem();
			System.out.println("Initialize Heat Missile System.....");
		}
		return HMS;
	}
	
	@Override
	public void launch(String source) {
		System.out.print("Heat Missile system launch from "+ source);
		
	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Missile blast Flight "+ destination);
		
	}

}
