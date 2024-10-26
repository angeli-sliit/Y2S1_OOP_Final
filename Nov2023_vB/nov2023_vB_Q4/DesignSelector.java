package nov2023_vB_Q4;

public abstract class DesignSelector {
	lDrawableshapes DS;
	lDrawableLine DL;
	
	public  void setDrawableshapes(lDrawableshapes DS) {
		this.DS=DS;
	}
	public  void setlDrawableLine(lDrawableLine DL) {
		this.DL=DL;
	}
	
	public void designLines() {
		DL.drawLines(getRobot());
	}
	public void drawShape() {
		DS.drawshapes(getRobot());
	}
	
	public abstract String getRobot();
}
