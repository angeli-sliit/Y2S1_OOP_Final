package oct2019_vB_Q4;

public abstract class Student {
	IFestival f;
	IPrograms p;
	
	public void setFestifal(IFestival f) {
		this.f=f;
	}
	
	public void setProgram(IPrograms p) {
		this.p=p;
	}
	public void offerPrograms() {
		p.offerPrograms();
	}
	 
	public void conductEvents () {
		f.performEvent();
	}
	
	public abstract void displayStudents();
	public abstract void DisplayCost(); 

}
