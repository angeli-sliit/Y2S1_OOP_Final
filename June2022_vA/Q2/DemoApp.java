package Q2;

import java.util.ArrayList;

public class DemoApp{
	public static void main(String[] args) {
		TCalculation<Integer> obj1 = new TCalculation<>();
		TCalculation<Double> obj2 = new TCalculation<>();
		
		obj1.append(10);
		obj1.append(20);
		obj1.append(30);
		
		obj2.append(10.4);
		obj2.append(20.2);
		obj2.append(30.3);
		
		System.out.println("Average of Integer ArrayList : " + obj1.avarage());
		System.out.println("Average of Double ArrayList : " + obj2.avarage());
	}
}



class TCalculation <T extends Number>{
	ArrayList<T> numList = new ArrayList<>();
	
	
	public T append(T num) {
		numList.add(num);
		return null;
	}
	
	public Double avarage() {
		Double avg = 0.0;
		Double tot =0.0;
		for(T i: numList) {
			tot=tot+i.doubleValue();
		}
		avg=tot/numList.size();
		return  avg;
	}
}

