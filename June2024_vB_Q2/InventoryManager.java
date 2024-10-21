package June2024_vB_Q2;



class GenericInventory<T extends Number>{

	public double calculateAverage(T[] array) {
		double sum =0;
		for(T elements : array) {
			sum += elements.doubleValue();
		}
		return sum/array.length;
	}
	
	public T calculateMinimum(T[] array) {
		T min =array[0];
		for(T i : array) {
			if(i.doubleValue() < min.doubleValue()) {
				min=i;
			}
		}
		return min;
		
	}
}


public class InventoryManager{
	public static void main(String[] args) {
		Integer[] Iarray = {10, 20, 30, 40, 50};
		
		Double[] Darray = {10.5, 20.5, 30.5, 40.5, 50.5};
		
		GenericInventory<Integer> intInventory = new GenericInventory<>();
		System.out.println("Integer Array Average: " + intInventory.calculateAverage(Iarray));
        System.out.println("Integer Array Minimum: " + intInventory.calculateMinimum(Iarray));
        System.out.println();
        
        
		GenericInventory<Double> DoubInventory = new GenericInventory<>();
		System.out.println("Double Array Average: " + DoubInventory.calculateAverage(Darray));
        System.out.println("Double Array Minimum: " + DoubInventory.calculateMinimum(Darray));
	}
}

