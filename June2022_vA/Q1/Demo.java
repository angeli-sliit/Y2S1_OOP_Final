package Q1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet squirrel1 = new Squirrel("Run3");
		squirrel1.cuddle();
		squirrel1.feed();
		squirrel1.getTotalPoints();
		
		Pet squirrel2 = new Squirrel("Run5");
		squirrel2.cuddle();
		squirrel2.feed();
		squirrel2.getTotalPoints();
		
		Pet garfield = new Cat();
		garfield.clean();
		garfield.cuddle();
		garfield.feed();
		garfield.getTotalPoints();		
		
		
		Pet parrot1 = new Parrot("walk");
		parrot1.cuddle();
		parrot1.feed();
		parrot1.getTotalPoints();
		
		

	}

}

@SuppressWarnings("serial")
class CaughtException extends Exception{
	public CaughtException(String message) {
		super(message);
	}
}


interface PointAllocator{
	public int getPoint();
	public void setPoint(int point);
	
}




abstract class Pet implements PointAllocator{
	int point;

	@Override
	public int getPoint() {
		return point;
	}

	@Override
	public void setPoint(int point) {
		this.point=point;
	}
	
	public abstract void feed();
	public abstract void clean();
	public abstract void cuddle();
	public abstract void getTotalPoints();
}


class Cat extends Pet{

	@Override
	public void setPoint(int point) {
		// TODO Auto-generated method stub
		super.setPoint(point);
	}
	
	public void feed() {
		System.out.println("Feeding the Cat.");
		setPoint(getPoint()+5);
	}
	
	public void cuddle() {
		System.out.println("Cuddling the Cat.");
		setPoint(getPoint()+15);
	}
	
	public void clean() {
		System.out.println("Cleaning the Cat.");
		setPoint(getPoint()+10);
	}
	
	public void getTotalPoints() {
		System.out.println("Total point is : " + getPoint());
	}
}







class Squirrel extends Pet{
	int point = 10;
	String command;
	
	
	public Squirrel(String run) {
		super();
		this.command = run;
	}

	@Override
	public void setPoint(int point) {
		// TODO Auto-generated method stub
		super.setPoint(point);
	} 
	
	public void feed() {
		System.out.println("Feeding the Squirrel.");
		setPoint(getPoint()+5);
	}
	public void clean() {
		System.out.println("Cleaning the Squirrel.");
		setPoint(getPoint()+10);
	}
	public void cuddle() {
		System.out.println("Cuddling the Squirrel.");
		setPoint(getPoint()+15);
	}
	
	public boolean isCaught() {
		try {
			if (command.equalsIgnoreCase("Run5")) {
				throw new CaughtException("Cautch");
			}
			else {
				System.out.println("Did not cautcht");
				return false;
			}
		}
		catch(CaughtException e) {
			 System.out.println(e.getMessage());
	            return true;
		}
	}
	
	
	public void getTotalPoints() {
		if(isCaught() == true) {
			point=0;
		}
		if(point != 0) {
			System.out.println("Total Point is "+ getPoint());
		}
	}
}






class Parrot extends Pet{
	int point = 15;
	String command;
	
	
	public Parrot(String walk) {
		super();
		this.command = walk;
	}
	@Override
	public void setPoint(int point) {
		// TODO Auto-generated method stub
		super.setPoint(point);
	}
	public void feed() {
		System.out.println("Feeding the Parrot.");
		setPoint(getPoint()+5);
	}
	public void clean() {
		System.out.println("Cleaning the Parrot.");
		setPoint(getPoint()+10);
	}
	public void cuddle() {
		System.out.println("Cuddling the Parrot.");
		setPoint(getPoint()+15);
	}
	
	public boolean isCaught() {
	        try {
	            if (command.equalsIgnoreCase("Walk")) {
	                throw new CaughtException("Caught");
	            }
	            System.out.println("Did not caught");
	            return false;
	        } 
	        catch (CaughtException e) {
	            System.out.println(e.getMessage());
	            return true;
	        }
	    }
	
	public void getTotalPoints() {
		if(isCaught() == true) {
			point=0;
		}
		if(point != 0) {
			System.out.println("Total Point is "+ getPoint());
		}
	}
}





















