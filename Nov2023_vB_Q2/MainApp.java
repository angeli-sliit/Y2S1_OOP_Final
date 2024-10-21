package Nov2023_vB_Q2;

import java.util.*;

public class MainApp {
	public static void main(String[] args) {
		Integer[] ar1={1,2,6,3,4,5};
		Double[] ar2 = {1.5,1.2,1.5,2.4,3.7};
		
		GenericCalculator<Integer> GCint =new GenericCalculator<>();
		System.out.println("Maximum number: " + GCint.CalculateMaximum(ar1));
		System.out.println("Product of number : " + GCint.calculateproduct(ar1));
		
		System.out.println();
		GenericCalculator<Double> GCdob =new GenericCalculator<>();
		System.out.println("Maximum number: " + GCdob.CalculateMaximum(ar2));
		System.out.println("Product of number : " + GCdob.calculateproduct(ar2));
		
	}
}


class GenericCalculator <T extends Number> {
	ArrayList<T> ar = new ArrayList<>();
	
	double mult=1;
	T max;
	public T CalculateMaximum(T[] array){
		 max = array[0];
		for(T i : array) {
			if(i.doubleValue() >max.doubleValue()) {
				max=i;
			}
		}
		return max;
		
	}
	public double calculateproduct(T[] array) {
		for(T i : array) {
			mult=mult*i.doubleValue();
		}
		return mult;
	}

}
