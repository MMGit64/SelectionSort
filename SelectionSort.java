
public class SelectionSort {
	
	public static void SelectionSort(double[] list) {		//Double instead of String, since we are dealing with numbers only.
														//'list' here is the command line argument 
		
		
		for (int i = 0; i < list.length; i++) {
			
			double currentMin = list[i];			//The current minimum number in the list
			int currentMinIndex = i;				//The index of that minimum number

			
			for (int j = i + 1; j < list.length; j++) {		//Consider the number after 'current minimum number'
				
				if (currentMin > list[j]) {					//If the i value (list[i]) is a larger number than j value (list[j])
					currentMin = list[j];					//The 'currentMin' variable is now assigned to list[j]
					currentMinIndex = j;					//And the currentMinIndex variable to j
				
				}
			}
		
			if (currentMinIndex != i) {						//We then consider the next unsorted number, for instance if 'k' is the current minimum index instead of i;
				
				list[currentMinIndex] = list[i];			//Then list[k] = list[i]
				list[i] = currentMin;						//And list[i] = k
			}												//Now the program will compare k value with j value 
		
		
		}
	}
	
	public static void main(String[] args) {
		
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

