package nov2023_vB_Q4;

public class TextilelndustryDemo {

	public static void main(String[] args) {
		DesignSelector  JR  = new  JapaneseRobort( );
		JR.setlDrawableLine(DashLine.getinstence());
		JR.designLines();
		JR.setlDrawableLine(DottedLines.getinstence());
		JR.designLines();
		JR.setlDrawableLine(StraightLine.getinstence());
		JR.designLines();
		
		
		DesignSelector  CR  = new  JapaneseRobort( );
		CR.setDrawableshapes(Circleshapes.getinstence());
		CR.drawShape();
		CR.setDrawableshapes(Squareshapes.getinstence());
		CR.drawShape();
		CR.setDrawableshapes(Triangleshapes.getinstence());
		CR.drawShape();

	}

}
