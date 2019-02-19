
public class SelectionSort {
	
	public static void SelectionSort(double[] list) {		//Double instead of String, since we are dealing with numbers only.
														//'list' here is the command line argument 
		
		
		for (int i = 0; i < list.length; i++) {
			
			double currentMinElement = list[i];			//The current minimum number in the list
			int currentMinIndex = i;				//The index of that minimum number

			
			for (int j = i + 1; j < list.length; j++) {		//Consider the number after 'current minimum number'
				
				if (currentMinElement > list[j]) {			//If the i value (list[i]) is a larger number than j value (list[j])
					currentMinElement = list[j];			//The 'currentMin' variable is now assigned to list[j], as we've now established that list[i] is larger value than list[j].
					currentMinIndex = j;					//And the currentMinIndex variable to j, effectively we have swapped list[i] with list [j] & index i with index j respectively
				
				}
			}
		
			if (currentMinIndex != i) {						//We then consider the next unsorted number
				
				list[currentMinIndex] = list[i];			//Swap the minimum number with next unsorted number
				list[i] = currentMinElement;				
			}												 
		
		
		}
	}
	
	public static void main(String[] args) {				//Main method
		
		double[] numList = {4, 3, 20, 9, 5};
		
		System.out.println("Prior to Selection sorting:");
		for(double i : numList) {
			System.out.println(i + " ");
		}
		System.out.println();
	
		SelectionSort(numList);
		
		System.out.println("After Selection Sorting:");
		for(double i : numList) {
			System.out.println(i + " ");
		}
		
	}
}


